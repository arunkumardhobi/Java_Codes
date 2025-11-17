// Write a program that calculates and prints the area and perimeter of a circle based on the radius provided by the user. 

import java.util.Scanner;

public class Week1_9 {
    public static void main(String[] args){
        System.out.println("Enter the redice od circle");
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();

        System.out.println("perimeter of circle is="+2*3.14*r);
              System.out.println("area of circle is="+3.14*r*r);  
               sc.close();
    }

}
