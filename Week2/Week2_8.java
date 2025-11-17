//Implement a simple calculator using primitive data types and Math class methods.

import java.util.Scanner;

public class Week2_8 {
    public static void main(String[] args) {
        System.out.println("Enter the first value");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
    
       System.out.println(Math.addExact(b, a));//add
       System.out.println(Math.multiplyExact(b, a) );//multi
       System.out.println(Math.subtractExact(b, a));//sub
       System.out.println(Math.floorDiv(b, a));//division
       sc.close();
    }
}
