package Arrays;
import java.util.*;
public class searchIndex {
    public static void main(String[] args) {
        //take an array as an input from the user . search for a given number x and
        //print the index at which it occures
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter a size of array :");
        int size=shubham.nextInt();
        int numbers[]=new int[size];
        System.out.println("Enter the Elements");
        for(int i=0;i<size;i++)
        {
            numbers[i]=shubham.nextInt();//accept the array
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(numbers[i]);
        }
        //now search the element in the array
        System.out.println("Enter the element which you are looking for");
        int x=shubham.nextInt();
        for(int i=0;i<size;i++)
        {
            if(numbers[i]==x)
            {
                System.out.println("Element found at position :"+i);
            }
        }
    }
}
