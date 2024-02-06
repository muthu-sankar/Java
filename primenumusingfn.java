import java.util.Scanner;
public class primenumusingfn {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number to check Prime\t");
        int num= in.nextInt();
        if(false == isprime(num))
        {
            System.out.println(num+"\t The Given Number is Not a prime");
        }
        else
        {
            System.out.println(num+ "\tThe Given Number is Prime");
        }
    }
    static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int c=2;
        while (c * c <= n)
        {
            if(n % c == 0)
            {
                return false;
            }
            c++;
        }
        return (c * c > n);
    }
}
