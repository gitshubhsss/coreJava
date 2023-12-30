package functions;
import java.util.*;
import java.util.Scanner;

//write a program to enter the numbers till user wants and at the end it should
// it should display the count of positive ,negative ,and zeros entered */
public class Count {
    public static void main(String[] args) {
        //initialise the counters
        int pcnt=0;
        int ncnt=0;
        int zcnt=0;
        int i;
        Scanner shubham=new Scanner(System.in);
        System.out.println("How many numbers you wants to insert");
        int size=shubham.nextInt();
        System.out.println("Enter "+size+" elements");
        int[]numbers=new int[size];
        for(i=0;i<size;i++)
        {
            numbers[i]=shubham.nextInt();//accepted the array elements
        }
        System.out.println("Entered Elements are :");
        for( i=0;i<size;i++)
        {
            System.out.println(numbers[i]);
        }
        //now will count the positive negative and zeroes
        for(i=0;i<size;i++)
        {
           if(numbers[i]>0)
           {
               pcnt++;
           }
           else if (numbers[i]<0)
           {
               ncnt++;
           }
           else if(numbers[i]==0)
           {
               zcnt++;
           }
           else
           {
               System.out.println("Wrong entry");
               break;
           }
        }
        System.out.println("positve count "+pcnt);
        System.out.println("negative count "+ncnt);
        System.out.println("zeroes count "+zcnt);



    }
}
