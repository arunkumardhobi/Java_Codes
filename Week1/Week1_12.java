//Create a program that swaps the values of two variables using a temporary variable. 

import java.util.Scanner;

public class Week1_12 {
    public static void main(String[] args){
        System.out.println("Enter the first number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;
         System.out.println("after swapup a:"+a+"b:"+b);
          sc.close();
        
    }
    
    
}
