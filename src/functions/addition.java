package functions;
import java.util.*;
public class addition {
    public static int add(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=shubham.nextInt();
        int b=shubham.nextInt();
        int sum=add(a,b);
        System.out.println("sum of two numbers is "+sum);

    }
}
