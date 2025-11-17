// Convert Celsius to Fahrenheit

import java.util.Scanner;

public class Week1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float c = sc.nextFloat();

        float f = (c * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit = " + f);

        sc.close();
    }
}
