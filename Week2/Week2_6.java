//Compare two primitive data types using their corresponding wrapper class equals() method.

import java.util.Scanner;

public class Week2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        Integer c = a;
        Integer d = b;
        boolean e = c.equals(d);
        System.out.println("True means value of a and b is equeal Flase means not equel" + e);
        sc.close();

    }

}
