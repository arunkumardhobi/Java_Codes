//Write a program to parse a boolean from a String using the Boolean wrapper class.

import java.util.Scanner;

public class Week2_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string in true and flase");
        String str=sc.nextLine();
        Boolean b=Boolean.parseBoolean(str);
        System.out.println(b);//conver from string to boolean
        sc.close();
    }

    
}
