package Arrays;
import java.util.*;
public class AsceDisceOrder {
    public static void main(String[] args) {
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter the size :");
        int size=shubham.nextInt();
        int numbers[]=new int[size];
        System.out.println("Entert the elements in the array");
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=shubham.nextInt();
        }
        boolean isAscending =true;
        boolean isDescending = true;
        for(int i=0;i<numbers.length-1;i++)
        {
            // 3 2 4 7 1
            if(numbers[i]<numbers[i+1])//3>2
            {
                isDescending=false; // means it is in desending order
            }
        }
        if(isAscending)
        {
            System.out.println("The elements are in assending oreder");
        }
        else
        {
            System.out.println("The array are not sorted in assending order");
        }
    }
}
