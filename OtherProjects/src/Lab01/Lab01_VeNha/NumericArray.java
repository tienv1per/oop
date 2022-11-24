import java.util.Scanner;
import java.util.Arrays;

public class NumericArray{

    public static void printArray(int A[]){
        int sum = 0;
        for(int i=0; i < A.length ; i++){
            sum = sum + A[i];
        }
        double average = sum / A.length;
        Arrays.sort(A);
        System.out.println("Array after sorted: ");
        System.out.println(Arrays.toString(A));
        System.out.println("Sum value of the array elements is : " + sum); 
        System.out.println("Average value of the array elements is : " + average); 
    }

    public static void main(String[] args){
        System.out.println("Choose 1 option: ");
        System.out.println("Option1: Array constant");
        System.out.println("Option2: Array from keyboard");
        Scanner menu = new Scanner(System.in);
        String menu_ans = menu.nextLine();
        

        if (menu_ans.trim().equals("1")){
            int A[] = new int[]{20, 30, 25, 35, -16, 60, -100};
            printArray(A);
        }
        else if (menu_ans.trim().equals("2")){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of elements you want to input: ");
            int n = sc.nextInt();
            
            int[] array = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++){
                array[i] = sc.nextInt();
            }
            sc.close();
            printArray(array);

        menu.close();
        }
    }
}
