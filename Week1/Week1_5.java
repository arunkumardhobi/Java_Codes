//simple intrest programe 

import java.util.Scanner;

public class Week1_5 {
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price");
        int p=sc.nextInt();
           System.out.println("Enter the rate of interest");
           float r=sc.nextFloat();

              System.out.println("Enter the year");
               float n=sc.nextFloat();
               System.out.println("total  interest="+(n*p*r)/100);


 sc.close();
    }
}
