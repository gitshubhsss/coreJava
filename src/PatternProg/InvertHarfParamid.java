package PatternProg;
import java.util.*;
public class InvertHarfParamid {
    /*  ****
    *   ***
    *   **
    *   *
    *   we have to print the pattern like this   */
    public static void main(String[] args) {
        /*for(int i=1;i<=5;i++)
        {
            for(int j=i-1;j<=4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
