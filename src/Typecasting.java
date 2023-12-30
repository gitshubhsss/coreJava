public class Typecasting {
    static void explicit()
    {
        double a=40.2;
        int b=(int)a;
        System.out.println(b);//this is the explicit type casting

    }
    public static void main(String[] args) {
        int a=4;
        double b=a;
        System.out.println(b);//this is implicit type casting
        Typecasting t=new Typecasting();
        t.explicit();
    }
}
