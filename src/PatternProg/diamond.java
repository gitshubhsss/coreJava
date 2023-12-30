package PatternProg;
import java.util.*;
public class diamond {
    public static void main(String[] args) {
        //write a program to print the diamond patterns
        //upper half
        for(int i=1;i<=4;i++)
        {
            //for spaces
            for(int j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            //for stars at a odd position
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=4-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
