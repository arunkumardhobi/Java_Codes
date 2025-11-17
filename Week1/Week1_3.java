import java.util.Scanner;

public class Week1_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        System.out.println("Sum of a and b = " + (a + b));
        System.out.println("Subtraction of a and b = " + (a - b));
        System.out.println("Product of a and b = " + (a * b));
        System.out.println("Division of a and b = " + ((b != 0) ? (a / b) : "undefined (division by zero)"));

        sc.close();
    }
}
