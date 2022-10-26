import java.util.Scanner;

public class AddTwoMatrices{
    public static void printMatrix(int M[][],
                                   int row,
                                   int col)
    {
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] add(int A[][], int B[][], int col, int row){
        int C[][] = new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static void main(String[] args){
        System.out.println("Choose 1 option: ");
        System.out.println("Option1: Matrices constant");
        System.out.println("Option2: Matrices from keyboard");
        Scanner menu = new Scanner(System.in);
        String menu_ans = menu.nextLine();

        if (menu_ans.trim().equals("1")){
            int A[][] = {{1, 2},
                         {3, 4}};
            int B[][] = {{5, 6},
                         {7, 8}};
            int C[][] = new int[1][1];
            C = add(A, B, 2, 2);
            printMatrix(C, 2, 2);
        }
        else if (menu_ans.trim().equals("2")){
            int m, n, c, d;
            Scanner in = new Scanner(System.in);
            System.out.println("Input number of rows of matrix: ");
            m = in.nextInt();
            System.out.println("Input number of columns of matrix: ");
            n = in.nextInt();

            int array1[][] = new int[m][n];
            int array2[][] = new int[m][n];

            System.out.println("Input elements of first matrix: ");
            for (c = 0; c < m; c++){
                for (d = 0; d < n; d++){
                    array1[c][d] = in.nextInt();
                }
            }
            System.out.println("Input the elements of second matrix: ");

            for (c = 0; c < m; c++){
                for (d = 0; d < n; d++){
                    array2[c][d] = in.nextInt();
                }
            }

            int sum_matrix[][];
            sum_matrix = add(array1, array2, m, n);
            System.out.println("Sum of the matrices: ");

            printMatrix(sum_matrix, m, n);
        }
        menu.close();
    }
}
