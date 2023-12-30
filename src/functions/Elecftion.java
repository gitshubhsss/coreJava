package functions;
import java.util.*;
public class Elecftion {
    public static void votingEligibility(int age)
    {
        if(age>=18)
        {
            System.out.println("you are eligible for voting");
        }
        else
        {
            System.out.println("Your age should be 18 ");
        }
    }
    public static void main(String[] args) {
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter the age :");
        int age=shubham.nextInt();
        votingEligibility(age);
    }
}
