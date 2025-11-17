import java.util.OptionalInt;

// Find the maximum difference between any two elements in an array.
public class Week3_44 {
    public static void main(String[] args) {
        int[] a = Common.getInputFromUser();
        Common c = new Common();

        OptionalInt largest = c.findLargestElement(a);
        OptionalInt smallest = c.findSmallestElement(a);
        int maximumDifference = largest.getAsInt() - smallest.getAsInt();
        System.out.println("maximum difference between any two elements in an array"+maximumDifference);


    }
}
