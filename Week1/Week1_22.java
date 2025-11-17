import java.util.Scanner;

public class Week1_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;

            case '-':
                System.out.println("Result: " + (a - b));
                break;

            case '*':
                System.out.println("Result: " + (a * b));
                break;

            case '/':
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero!");
                break;

            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
