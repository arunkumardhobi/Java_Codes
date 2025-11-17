//Program to check whether a given number is odd or even using both int and Integer.

import java.util.Scanner;

public class Week2_3 {
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Integer b = a;

        if ((a % 2 == 0)) {
            System.out.println("the number is even");

        } else {
            System.out.println("the number ia odd");
        }

        sc.close();
    }

}
