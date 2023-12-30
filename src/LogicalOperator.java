public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println("logical And");
        System.out.println((10>5)&& (2>1));
        System.out.println((10<50)&& (2>1));//two result should be true
        System.out.println((50>200)&&(20<60));


        System.out.println("Logical or");
        System.out.println((10>5) || (2>1));
        System.out.println((10<50) || (2>1));
        System.out.println((50>200) || (20<60));//if one condition is true then the result will be true;

        System.out.println("Logical not");
        System.out.println(!(10>5));//it will reverse the result //false
    }
}
