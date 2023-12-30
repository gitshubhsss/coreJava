import java.util.Scanner;

public class ifelse
{
    Scanner shubham =new Scanner(System.in);
    public void Age()
    {
        int age;
        System.out.println("Enter your age");
        age=shubham.nextInt();
        if(age>=18)
        {
            System.out.println("eligible  for the voting");
        }
        else{
            System.out.println("not eligible for the voting");
        }
    }
    public void oddeven()
    {
        int n;
        System.out.println("Enter a number");
        n=shubham.nextInt();
        if(n%2==0){
                System.out.println("this is even number");
        }
        else {
            System.out.println("this is odd number");
        }

    }
    public void Greter()
    {
        int a,b;
        System.out.println("Enter the value of a");
        a=shubham.nextInt();
        System.out.println("Enter the value of b");
        b=shubham.nextInt();
        if(a==b)
        {
            System.out.println("a and b are equals");
        }
        else if(a<b)
        {
            System.out.println("a is less than b");
        }
        else if(a>b)
        {
            System.out.println("b is greater than a");
        }
        else
        {
            System.out.println("error");
        }
    }
    public static void main(String[] args) {
        ifelse obj=new ifelse();
        obj.Greter();
    }
}
