import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

// Custom Exception
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class Common {

    public static final Scanner sc = new Scanner(System.in);

    // Get a single array element from user
    public static int getArrayElementFromUser() {

        while (true) {
            System.out.print("Enter the natural number: ");
            String input = sc.next();
            

            try {
                return Validator.validateNumber(input);  
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    // Geta single array element from user
    public static int getArrayElementValidation() {

        while (true) {
          
            String input = sc.next();

            try {
                return Validator.validateNumberforArray(input);  
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Get array from user
    public static int[] getInputFromUser() {

        int length = getArrayElementFromUser();  // validated, no negative, no chars

        int[] a = new int[length];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = getArrayElementValidation();  // validated input
        }

        return a;
    }

    // Display array
    public static void displayArray(int[] a) {
        System.out.println("printing the Array elements:");
        Arrays.stream(a).forEach(System.out::println );
    }

    // Sum of array
    public int sumOfArray(int[] a) {
        return Arrays.stream(a).sum();
    }

    // Largest element
    public OptionalInt findLargestElement(int[] a) {
        if (a == null || a.length == 0) {
            return OptionalInt.empty();
        }
        return Arrays.stream(a).max();
    }

    // Smallest element
    public OptionalInt findSmallestElement(int[] a) {
        if (a == null || a.length == 0) {
            return OptionalInt.empty();
        }
        return Arrays.stream(a).min();
    }

    // Reverse array
    public int[] reverseArray(int[] a) {
        int n = a.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = a[n - 1 - i];
        }
        return result;
    }

    // Frequency
    public int getFrequency(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target)
                count++;
        }
        return count;
    }

    // Check element exists
    public static void checkElementInArray(int num, int[] a) {
        boolean found = false;
        for (int value : a) {
            if (num == value) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Array contains the number: " + num);
        else
            System.out.println("Array does not contain the number: " + num);
    }

    // Copy array
    public int[] copyArray(int[] a) {
        return Arrays.copyOf(a, a.length);
    }

    // Ascending sort
    public int[] ascendingOrderSorting(int[] a) {
        Arrays.sort(a);
        return a;
    }

    // Descending sort
    public int[] descendingOrderSorting(int[] a) {
        int[] sorted = ascendingOrderSorting(a);
        return reverseArray(sorted);
    }

   
   
}

