package functions;
import java.util.*;
public class Average {
    public static int printAverage(int a, int b, int c){
    return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter 3 numbres");
        int a=shubham.nextInt();
        int b=shubham.nextInt();
        int c=shubham.nextInt();

        int result=printAverage(a,b,c);
        System.out.println("the average of 3 numbers is :"+result);
    }
}
