import java.sql.SQLOutput;
import java.util.Scanner;

public class Asma2 {
    public static void main(String[] args) {
        double p=3.14, area,z,circumference;
        Scanner input=new Scanner(System.in);
        System.out.println("enter radius=");
        z=input.nextDouble();
        area=z*z*p;
        System.out.println("area of circle ="+area);
        circumference=2*z*p;
        System.out.println("circumference ="+circumference);
    }
}
