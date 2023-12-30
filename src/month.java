import java.util.Scanner;

public class month {
    public static void main(String[] args) {
       int Month,ch;
       Scanner shubham=new Scanner(System.in);
       do {
           System.out.println("ENTER THE MONTH ");
           System.out.println("Enter your choise");
           ch=shubham.nextInt();
           switch (ch)
           {
               case 1:System.out.println("januvary");
                        break;
               case 2:System.out.println("FEB");
                   break;
               case 3:System.out.println("march");
                        break;

               case 4:System.out.println("april");
                        break;
           }
       }
       while(ch<13);
    }
}
