//Write a program to calculate the Body Mass Index (BMI) given the height
// (in meters) and weight (in kilograms) of a person. 
//The formula for BMI is BMI = weight / (height * height). 

import java.util.Scanner;

public class Week1_15 {
    public static void main(String[] args) {
        System.out.println("Enter the height:");
        Scanner sc=new Scanner(System.in);
        double h=sc.nextDouble();
        System.out.println("Enter the wight in kg w:");
        double w=sc.nextDouble();
        double BMI=w/(h*h);
        System.out.println("the men bmi is "+BMI);
         sc.close();

    }
    
}
