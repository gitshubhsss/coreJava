package Loopsinjava;
import java.util.*;
public class tablemulti {
    public static void main(String[] args) {
        //print the multiplication table using the user input
       int multi=0;
       int n;
       Scanner shubham=new Scanner(System.in);
       System.out.println("Enter the value of n");
       n=shubham.nextInt();
       for(int i=1;i<=10;i++)
       {
           multi=n*i;
           System.out.println(multi);
       }

    }
}
