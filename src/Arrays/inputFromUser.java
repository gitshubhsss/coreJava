package Arrays;
import java.util.*;
public class inputFromUser {
    public static void main(String[] args) {
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=shubham.nextInt();
        int marks[]=new int[size];
        //for accepting the array
        System.out.println("Enter the marks");
        for(int i=0;i<size;i++)
        {
            marks[i]=shubham.nextInt();
        }
        //for display the array
        System.out.println("your marks: ");
        for(int i=0;i<size;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
