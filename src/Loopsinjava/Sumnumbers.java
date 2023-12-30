package Loopsinjava;

import java.util.Scanner;

public class Sumnumbers {
    public static void main(String[] args) {
        int i,sum =0,n;
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter the number");
        n=shubham.nextInt();
        for(i=1;i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.println(sum);

    }
}
