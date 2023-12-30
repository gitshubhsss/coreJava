package functions;

import java.util.Enumeration;
import java.util.Scanner;

public class factorial {
    public static int  fact(int num){
        if(num<0){
            System.out.println("invalid number");

        }
        int result=1;
        for(int i=1;i<=num;i++)
        {
           result=result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=shubham.nextInt();
        int result =fact(n);
        System.out.println("factorial of a numbers is "+result);


    }
}
