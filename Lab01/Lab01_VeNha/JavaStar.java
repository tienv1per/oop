import java.util.Scanner;

public class JavaStar{
    public static void main(String[] args){
        System.out.println("Nhap so hang: ");
        Scanner height = new Scanner(System.in);
        double dHeight = height.nextDouble();
        int k = 0;
        System.out.println();

        for (int i = 1; i <= dHeight; i++, k = 0){
            for (int space = 1; space <= dHeight - i; space++){
                System.out.print(" ");
            }
            while (k != 2 * i - 1){
                System.out.print("*");
                k++;
            }
            System.out.println();
        }
    }
}
