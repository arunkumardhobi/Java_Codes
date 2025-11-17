import java.util.Scanner;

public class Week1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

      
        double area = length * width;
        double perimeter = 2 * (length + width);

      
        System.out.println("Area of the rectangle is: " + area);
        System.out.println("Perimeter of the rectangle is: " + perimeter);

        sc.close();
    }
}
