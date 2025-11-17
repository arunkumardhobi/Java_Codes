//Find all pairs in an array whose sum equals a given number.
public class Week3_42 {

public static void main(String[] args) {
        int[] a = Common.getInputFromUser(); // assuming this returns an int[]
        int target = Common.getArrayElementFromUser();
        Common41_50 c = new Common41_50();
        c.checkSum(a, target);
    }
}
