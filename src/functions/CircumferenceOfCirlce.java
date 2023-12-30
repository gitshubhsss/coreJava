package functions;
import java.util.*;
public class CircumferenceOfCirlce {
    //2×π×radius
    public static int  toFindTheCircumference(int radius){
        double pi=3.14;
        double circumference=2*pi*radius;
       return (int) circumference;

    }
    public static void main(String[] args) {
        Scanner shubham=new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius=shubham.nextInt();

        double circumference = toFindTheCircumference(radius);
        System.out.println("Circumference of the circle is "+circumference);
    }
}
