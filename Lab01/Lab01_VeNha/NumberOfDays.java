import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class NumberOfDays{
    public static boolean checkLeapYear(int year){
        boolean leap;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    leap = true;
                }
                else{
                    leap = false;
                }
            }
            else{
                leap = true;
            }
        }
        else{
            leap = false;
        }
        return leap;
    }


    public static void main(String[] args){
        boolean leap;
        
        String[] days_31 = new String[]{"January", "Jan", "Jan.", "1",
                                        "March", "Mar", "Mar.", "3",
                                        "May", "5",
                                        "July", "Jul", "7",
                                        "August", "Aug", "Aug.", "8",
                                        "October", "Oct", "Oct.", "10",
                                        "December", "Dec.", "Dec", "12"};

        String[] days_30 = new String[]{"April", "Apr", "Apr.", "4",
                                        "June", "Jun", "6",
                                        "September", "Sept.", "Sep",
                                        "November", "Nov.", "Nov", "11"};

        String[] days_29 = new String[]{"February", "Feb.", "Feb", "2"};

        List<String> list31 = Arrays.asList(days_31);
        List<String> list30 = Arrays.asList(days_30);
        List<String> list29 = Arrays.asList(days_29);
        
        int num_digit_year;
        String month;
        int year;
        Scanner keyboard;

        do {
            keyboard = new Scanner(System.in);
            System.out.println("Nhap thang can tim: ");
            month = keyboard.nextLine();
            System.out.println("Nhap nam can tim: ");
            year = keyboard.nextInt();
            num_digit_year = String.valueOf(year).length();
            
        } while(num_digit_year != 4 || (!(list29.contains(month)) && !(list30.contains(month)) && !(list31.contains(month))));

        leap = checkLeapYear(year);

        if (list31.contains(month)){
            System.out.println("Thang co 31 ngay");
        } 
        else if (list30.contains(month)){
            System.out.println("Thang co 30 ngay");
        }
        else if(list29.contains(month)){
            if (leap){
                System.out.println("Thang co 29 ngay");
            }
            else{
                System.out.println("Thang co 28 ngay");
            }
        }
        keyboard.close();
    }
}
