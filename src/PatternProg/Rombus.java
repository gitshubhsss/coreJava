package PatternProg;
import java.util.*;
public class Rombus {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            //this loop is for the spaces
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
