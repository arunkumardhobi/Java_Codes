 //Create a program that converts a given number of minutes into hours and remaining minutes. 

import java.util.Scanner;

public class Week1_20 {
    public static void main(String[] args) {
        System.out.println("Enter the minutes");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int h=m/60;
        int r=m%60;
        System.out.println("hours"+h+"minutes"+r);


        
    }
    
}
