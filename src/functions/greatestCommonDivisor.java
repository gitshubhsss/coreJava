package functions;
import java.util.*;
//write the funtion that calculates greatest common divisor of two numbers
public class greatestCommonDivisor
{
    public static int CalculateGCD(int num1,int num2)
    {
        while(num2 !=0)
        {
            int temp=num2;
            num2=num1%num2;
            num1=temp;

        }
        return num1;
    }

    public static void main(String[] args)
    {
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=shubham.nextInt();
        System.out.println("Enter the second number");
        int b=shubham.nextInt();
        int GCD=CalculateGCD(a,b);
        System.out.println("gcd :"+GCD);
    }
}
