package functions;
import java.util.*;
public class fabbonacci {
    public static void main(String[] args) {
         Scanner shubham=new Scanner(System.in);
         System.out.println("Enter a number:");
         int n=shubham.nextInt();
         int a=0;
         int b=1;
         int c;
         for(int i=1;i<=n;i++)
         {
            System.out.println(a+" ");//0 1 1 2 3 5
            c=a+b;//c=0+1=1 c=1+1=2 c=1+2=3 c=2+3=5 c=3+5=8 c=5+8=13
            a=b;//a=1; a=1 a=2 a=3 a=5 a=8
            b=c;//b=1 b=2 b=3 b=5 b=8 b=18
         }

    }
}
