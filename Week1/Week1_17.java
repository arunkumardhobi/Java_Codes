//Write a program that converts 
//a given number of days into years, weeks, and remaining days. 

import java.util.Scanner;

public class Week1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int days = sc.nextInt();

        int years = days / 365;          
        int remainingDays = days % 365; 
        int weeks = remainingDays / 7;  
        int daysLeft = remainingDays % 7; 

        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + daysLeft);

        sc.close();
    }
}
