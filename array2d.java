import java.util.Scanner;

public class array2d{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows=in.nextInt();
        System.out.println("Enter the number of column");
        int col=in.nextInt();

        int[][] arr= new int[rows][col];

        System.out.println("Enter The Array value");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {

                arr[i][j]= in.nextInt() ;

            }

        }

        //2d array print using
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(arr[i][j]+"\t");

            }
            System.out.println();

        }

    }
}
