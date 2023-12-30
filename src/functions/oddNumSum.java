package functions;
import java.util.*;
public class oddNumSum {
    public static void sumOfAllOddNumbers(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                sum=sum+i;
            }
        }
        System.out.println("sum of all odd numbers is :"+sum);
    }
    public static void main(String args[])
    {
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=shubham.nextInt();
       sumOfAllOddNumbers(n);


    }
}
