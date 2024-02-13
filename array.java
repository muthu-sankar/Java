import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        int[] arr = new int[3];
//        System.out.print("Enter the Array Element");
//        for (int i=0; i<arr.length;i++)
//        {
//            arr[i]=in.nextInt() ;
//        }
//
//        for (int i=0; i<arr.length;i++)
//        {
//            System.out.print("\t"+arr[i]);
//        }

        String[] str = new String[5];
        System.out.println("Enter the String Array");
        for (int i = 0; i < str.length ; i++)
        {
           str[i]=in.next() ;
        }

        for (int i = 0; i < str.length ; i++)
        {
            System.out.print("\t"+str[i]);
        }
    }

}
