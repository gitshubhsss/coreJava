package functions;
import java.util.*;
public class Greater {
    public static void toFindGreaterNum(int a,int b){
        if(a>b)
        {
            System.out.println(a+"is greater than :"+b);
        }
        else if(b>a)
        {
            System.out.println(b+"is greater than :"+a);
        }
        else {
            System.out.println("both are equals");
        }
    }
    public static void main(String[] args) {
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a=shubham.nextInt();
        int b=shubham.nextInt();
        toFindGreaterNum(a,b);
    }
}
