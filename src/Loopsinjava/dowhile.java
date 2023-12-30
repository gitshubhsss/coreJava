package Loopsinjava;
import java.util.*;
import java.util.Scanner;

/*Make a menu-driven program. The user can enter 2 numbers, either 1 or 0.
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)
*/
public class dowhile {
    public static void main(String[] args) {
       int n,ch;
       Scanner shubham = new Scanner(System.in);
       do {
           System.out.println("0:for exit\n1:to continue");
           System.out.println("Enter your choise");
           ch=shubham.nextInt();
           switch (ch) {
               case 0:System.out.println("exit");
                   break;
               case 1:
                   System.out.println("Enter your marks");
                   int marks = shubham.nextInt();
                   if (marks >= 90) {
                       System.out.println("this is good");

                   } else if (marks >= 89 && marks >= 60) {
                       System.out.println("this is also good");
                   } else if (marks >= 59 && marks >= 0) {
                       System.out.println("this is good as well");
                   }
                   break;

           }

       }while(ch<3);
    }
}
