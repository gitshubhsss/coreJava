package Loopsinjava;
import java.util.*;
public class even {
    public static void main(String[] args) {
        //program to print all the even numbers till n;
       int i,n;
       Scanner shubham=new Scanner(System.in);
       System.out.println("Enter the value of n");
       n=shubham.nextInt();
       for(i=0;i<=n;i++)
       {
           if(i%2==1)
           {
               System.out.println(i);
           }
       }

    }
}
