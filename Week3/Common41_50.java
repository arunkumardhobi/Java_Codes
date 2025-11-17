import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Common41_50 {
    //Find all pairs in an array whose sum equals a given number
    public void checkSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }


//Find the minimum number of swaps needed to sort an array.

//Find the median of an unsorted array.
    public  int median(int[] a) {
        int n = a.length;
        Arrays.sort(a);

        if (n % 2 == 1) {
            // Odd length
            return a[n / 2];
        } else {
            // Even length: average of two middle numbers
            int mid1 = a[n/2 - 1];
            int mid2 = a[n/2];
            return (mid1 + mid2) / 2;
        }
    }
    public  HashSet<Integer> intersection(int[] a, int[] b, int[] c) {
        HashSet<Integer> result = new HashSet<>();

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length && k < c.length) {

            if (a[i] == b[j] && b[j] == c[k]) {
                result.add(a[i]);
                i++;
                j++;
                k++;
            }
            else {
                int min = Math.min(a[i], Math.min(b[j], c[k]));

                if (a[i] == min) i++;
                if (b[j] == min) j++;
                if (c[k] == min) k++;
            }
        }
        return result;
    }
    //Find the majority element in an array
    public  void majorityElement(int[] array) {
        Comman10_20 c = new Comman10_20();
        HashMap<Integer, Integer> frequencyCount = c.frequencyCount(array);

        int n = array.length;
        boolean found = false;

        for (int key : frequencyCount.keySet()) {
            int count = frequencyCount.get(key);
            System.out.println(key + " : " + count);

            if (count > n / 2) {
                System.out.println("Majority Element = " + key + " (count = " + count + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No majority element found.");
        }
    }
}
