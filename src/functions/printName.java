package functions;
import java.util.*;
public class printName {
    public static void printMyName(String name)
    {
        System.out.println("Your name is "+name);
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner shubham=new Scanner(System.in);
        String name=shubham.next();
        printMyName(name);

    }
}
