// Implement a simple MathUtility class with static methods 
// for common math operations (add, subtract, multiply, divide).

import java.util.Scanner;

public class Week2_13 {
    public static void add(int a, int b) {
        System.out.println("addtion of a and b:" + a + b);

    }

    public static void sub(int a, int b) {
        System.out.println("subtraction of a and b:" + (a - b));

    }

    public static void mul(int a, int b) {
        System.out.println("multipication of a and b:" + a * b);

    }

    public static void div(int a, int b) {
        System.out.println("devision of a and b:" + a / b);

    }

    public static void main(String[] args) {
        System.out.println("Enter the first number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        add(a, b);
        sub(a, b);
        mul(a, b);
        div(a, b);
        sc.close();

    }

}
