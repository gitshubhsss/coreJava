import java.util.Scanner;
import java.util.*;
import java.lang.System;
public class switchcase {

    public static void main(String[] args) {
                int a,b,result,ch;
                Scanner shubham=new Scanner(System.in);
                do {
                    System.out.println("calculator");
                    System.out.println("\n1:Addition\n2:substraction\n3:multiplication\n4:division\n5:remeinder");
                    System.out.println("Enter your choise");
                    ch=shubham.nextInt();
                    switch(ch)
                    {
                        case 1:System.out.println("Enter two numbers\n");
                                a=shubham.nextInt();
                                b=shubham.nextInt();
                                result=a+b;
                                System.out.println(a+"+"+b+"="+result);
                                break;

                        case 2:System.out.println("Enter two numbers\n");
                             a=shubham.nextInt();
                             b=shubham.nextInt();
                             result=a-b;
                             System.out.println(a+"-"+b+"="+result);
                             break;

                        case 3:System.out.println("Enter two numbers\n");
                             a=shubham.nextInt();
                             b=shubham.nextInt();
                             result=a*b;
                             System.out.println(a+"*"+b+"="+result);
                             break;

                        case 4: System.out.println("Enter two numbers\n");
                            a=shubham.nextInt();
                            b=shubham.nextInt();
                            result=a/b;
                            System.out.println(a+"/"+b+"="+result);
                            break;

                        case 5:System.out.println("Enter two numbers\n");
                            a=shubham.nextInt();
                            b=shubham.nextInt();
                            result=a%b;
                            System.out.println(a+"%"+b+"="+result);
                            break;

                    }

                }while (ch>8);
    }
}
