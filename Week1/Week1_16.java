//Create a program that converts an amount from one currency 
//to another (e.g., USD to INR) using a predefined conversion rate. 

import java.util.Scanner;

public class Week1_16 {
    public static void main(String[] args) {
        System.out.println("Enter the amount of mony in the INR");
        Scanner sc=new Scanner(System.in);
        double INR=sc.nextDouble();
        System.out.println("INR to USD"+INR*87);
         sc.close();


    }
}
