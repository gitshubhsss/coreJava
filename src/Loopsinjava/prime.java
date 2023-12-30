package Loopsinjava;

import java.util.Scanner;

//take a input from the user and check the number is prime or not
public class prime {
    public static void main(String[] args) {
        int n;
        int count=0;
        Scanner shubham=new Scanner(System.in);
        System.out.println("enter the number");
        n=shubham.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("this is prime muber");
        }
        else
        {
            System.out.println("this is not a prime number");
        }
    }
}
