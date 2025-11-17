//Create a program that compares two numbers 
//and prints whether the first is greater, less than, or equal to the second.

import java.util.Scanner;

public class Wee1_11 {
    public static void main(String[] args) {
        System.out.println("inter the first number 1");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the secon number");
        int b=sc.nextInt();
        if (a==b) {
            System.out.println("a and b are equeal ");
            
        } else if (a>b) {
           System.out.println("a is grater then b");
            
        } else{
            
           System.out.println("a is less then b");
            
        }
         sc.close();
    }
    
}
