import java.util.Arrays;
import java.util.Scanner;

public class array2d{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows=in.nextInt();
        System.out.println("Enter the number of column");
        int col=in.nextInt();

        int[][] arr= new int[rows][col];
        //Input
        System.out.println("Enter The Array value");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {

                arr[i][j]= in.nextInt() ;

            }

        }

        /*
2d array print using normal way
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {

                System.out.print(arr[i][j]+"\t");

            }
            System.out.println();

        }
print using array to string method
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
print using Enhanced for Loop
Here arr is an array so we assign it into Int[] Num and using arrays.tostring method to print a array
*/


        for(int[] num: arr){
            System.out.println(Arrays.toString(num));
        }



    }
}
