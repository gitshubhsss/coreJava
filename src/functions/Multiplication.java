package functions;
import java.util.*;
public class Multiplication {
    public static int multiply(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=shubham.nextInt();
        int b=shubham.nextInt();
        System.out.println(a+"*"+b+":"+multiply(a,b));
    }
}
