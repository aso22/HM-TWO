import java.util.Scanner;

public class Asma5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the value of a=");
        int a= in.nextInt();
        System.out.println("enter the value of b=");
       int b=in.nextInt();
       a=a*b;
       b=a/b;
       a=a/b;
        System.out.println("please enter the number a=");
        System.out.println(a);
        System.out.println("please enter the number b=");
        System.out.println(b);
    }
}
