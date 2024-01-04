package Arrays;
import java.util.*;
public class names {
    public static void main(String[] args) {
        //Take an array of names as input from the user and print them on the screen.
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=shubham.nextInt();
        String []names=new String[size];
        System.out.println("Enter the"+size+" names");
        for(int i=0;i<names.length;i++)
        {
            names[i]=shubham.next();//accepting the names
        }
        for(int i=0;i<names.length;i++)
        {
            System.out.println("name "+(i+1) +" is :"+names[i]);
        }
    }
}
