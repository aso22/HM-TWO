import java.util.Scanner;

public class Asma8 {
    public static void main(String[] args) {
        int x,power;
        Scanner input=new Scanner(System.in);
        System.out.println("enter num =");
        x= input.nextInt();
        System.out.println("the square="+(x*x));
        System.out.println("the cube="+(x*x*x));
        System.out.println("the power of is="+Math.pow(x,4));
    }
}
