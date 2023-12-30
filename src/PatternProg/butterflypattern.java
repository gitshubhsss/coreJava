package PatternProg;
import java.util.*;
public class butterflypattern {
    public static void main(String[] args) {
        //outer loop
        //upper half
        for(int i=1;i<=5;i++)
        {

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(5-i);j++) //this looop is for the spaces
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=5;i>=1;i--)
        {

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(5-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
