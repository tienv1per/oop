import java.util.Scanner;
import java.lang.Math;

public class LinearEquation{
    public static void first_degree_equa(double a, double b){
        double answer = -b / a;
        System.out.println("Nghiem cua phuong trinh la: " + answer);
    }

    public static void system_first_degree_equa(double a11, double a12, double b1, double a21, double a22, double b2){
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 *  a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        System.out.println("Nghiem x1 la: " + D1/D);
        System.out.println("Nghiem x2 la: " + D2/D);
    }

    public static void second_degree_equation(double a, double b, double c){
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Nghiem thu nhat cua pt la: " + x1);
        System.out.println("Nghiem thu hai cua pt la: " + x2);

    }

    public static void main(String[] args){
        System.out.println("Choose 1 option: ");
        System.out.println("Option1: first-degree equation");
        System.out.println("Option2: system of first-degree eqaution");
        System.out.println("Option3: second-degree equation");
        Scanner menu = new Scanner(System.in);
        String menu_ans = menu.nextLine();
        
        if (menu_ans.trim().equals("1")){ 
            Scanner num_1 = new Scanner(System.in);
            Scanner num_2 = new Scanner(System.in);

            double num1 = num_1.nextDouble();
            double num2 = num_2.nextDouble();

            num_1.close();
            num_2.close();

            first_degree_equa(num1, num2);
        }

        else if (menu_ans.trim().equals("2")){
            Scanner a_11 = new Scanner(System.in);
            Scanner a_12 = new Scanner(System.in);
            Scanner b_1 = new Scanner(System.in);
            Scanner a_21 = new Scanner(System.in);
            Scanner a_22 = new Scanner(System.in);
            Scanner b_2 = new Scanner(System.in);

            double a11 = a_11.nextDouble();
            double a12 = a_12.nextDouble();
            double b1 = b_1.nextDouble();
            double a21 = a_21.nextDouble();
            double a22 = a_22.nextDouble();
            double b2 = b_2.nextDouble();

            a_11.close();
            a_12.close();
            b_1.close();
            a_21.close();
            a_22.close();
            b_2.close();

            system_first_degree_equa(a11, a12, b1, a21, a22, b2);
        }
        else if (menu_ans.trim().equals("3")){
            Scanner aa = new Scanner(System.in);
            Scanner bb = new Scanner(System.in);
            Scanner cc = new Scanner(System.in);

            double a = aa.nextDouble();
            double b = bb.nextDouble();
            double c = cc.nextDouble();

            aa.close();
            bb.close();
            cc.close();

            second_degree_equation(a, b, c);
        }

        menu.close();
    }
}
