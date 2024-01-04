package functions;
import java.util.*;
public class power {
    public static long power(int x,int n)
    {
        long pow=1;
        for(int i=0;i<n;i++)//n=2
        {
            pow = pow * x;//here
            /* 1 * 7
            *  7 * 7 = 49 */
        }
        return pow;
    }
    public static void main(String[] args) {
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter x :");
        int x=shubham.nextInt();
        System.out.println("Enter n:");
        int n=shubham.nextInt();
        long pow=power(x,n);
        System.out.println("X power n :"+pow);
    }
}
