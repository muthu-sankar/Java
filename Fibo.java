import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int num= in.nextInt();

        int a=0;
        int b=1;
        int count=2;

        System.out.println(a);

        while (count<=num){
            int temp=b;
            b=a+b;
            a=temp;
            System.out.println(b);

            count++;

        }


    }
}
