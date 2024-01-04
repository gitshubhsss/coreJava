package Arrays;
import java.util.*;
public class MinMax {
    public static void main(String[] args) {
        //Find the maximum & minimum number in an array of integers.
        //take a n mumbers from the user and find the minimum and maximum from that numbers
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=shubham.nextInt();
        int arr[]=new int[size];
        //to find the minimum and maximum form the array will assume it as min=arr[0] and max=arr[0]
        //now will except the elements in the array
        System.out.println("Enter the elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=shubham.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        //now will find who is large and who is small
        for(int i=1;i<arr.length;i++)
        {
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        System.out.println("Max :"+max);
        System.out.println("Min :"+min);
    }
}
