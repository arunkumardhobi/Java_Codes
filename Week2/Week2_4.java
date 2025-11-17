//Use Double wrapper class to round a floating-point number to two decimal places.

import java.util.Scanner;

public class Week2_4 {
public static void main(String[] args) {
        
     System.out.println("Enter the number in double");
        Scanner sc=new Scanner(System.in);
      double a=sc.nextDouble();
      double roundvalue=Double.valueOf(Math.round((a*100)))/100;
      System.out.println(roundvalue);
      sc.close();
       
}

    
}

   