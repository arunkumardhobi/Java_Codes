//Convert a character to its ASCII value using the Character wrapper class.

import java.util.Scanner;

public class Week2_7 {
    public static void main(String[] args) {
        System.out.println("Enter the caractor");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        Character a=ch;
        int b=a;
        System.out.println(b);
        sc.close();
    


        
    }
}
