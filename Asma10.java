import java.util.Scanner;

public class Asma10 {


        public static void main(String[] args) {
            int a,b,sum,diff,dist,pro;
            double average;
            Scanner input=new Scanner(System.in);
            System.out.println("enter first value=");
            a=20;
            System.out.println("enter second value=");
            b=25;
            sum=a+b;
            diff=a-b;
            dist=diff;
            average=sum/2;
            pro=a*b;
            System.out.println("sum="+sum);
            System.out.println("diff="+diff);
            System.out.println("average="+average);
            if(dist>0){
                System.out.println("dist="+diff);
            }
            if(dist<0){
                System.out.println("dist="+(-1*diff));
            }
            if(a>b){
                System.out.println("the max1mum="+a);
            }
            if(b>a){
                System.out.println("the max1mum="+b);
            }
            if(a<b){
                System.out.println("the min1mum="+a);
            }
            if(b<a){
                System.out.println("the min1mum"+b);}
        }

    }
