//Sum of Digits: Create a program that calculates the sum of the 
//digits of a given integer. 

import java.util.Scanner;

public class Week1_18 {
    public static void main(String[] args) {
        System.out.println("Enter the number n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while (n>0) {

            int b=n%10;
            sum=sum+b;
           n= n/10;

            
        }
        System.out.println("sum Digits is:"+sum);

        sc.close();



    }
    
}
