package PatternProg;
import java.util.*;
public class hollowrectangle {
    public static void main(String[] args) {
        int i;
        int j;
        //outerloop
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i==1 || i==4 || j==1 || j==5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
