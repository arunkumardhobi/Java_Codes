import java.util.Arrays;
import java.util.HashSet;

public class Common30_40 {



    public  int[] MoveallZeroestotheEnd(int a[]){
      
        int count = 0; // Count of non-zero elements


        // Traverse the array. If element is not zero, place it at index 'count'
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[count] = a[i];
                count++;
            }
        }

        // Now fill remaining positions with 0
        while (count < a.length) {
            a[count] = 0;
            count++;
        }

        // Print the updated array
        System.out.println("Array after moving zeroes to end:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        return a;

    }
//find the maxsubarraysum
    public  int maxSubArraySum(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray or start fresh from nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public  int maxProduct(int[] arr) {
        if (arr == null || arr.length < 2)
            throw new IllegalArgumentException("Array must contain at least two elements");

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;


        for (int n : arr) {
            // Track largest values
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max2 = n;
            }


        }

        return (max1 * max2);
    }

    //find the max three product
    public int maxProductOfThree(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n-1] * arr[n-2] * arr[n-3];
    }

    //Check if an array is sorted in ascending order
    public boolean checkArraySort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i-1] > arr[i]) {
                return false;
            }
        }
       return true;
    }
    //Check if an array is sorted in descending order
    public boolean isSortedDescending(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                return false;
            }
        }
        return true;
    }
    //Find the longest consecutive subsequence in an array.
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        Arrays.sort(nums);

        int longest = 1;
        int current = 1;

        for (int i = 1; i < nums.length; i++) {

            // Skip duplicates
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            // Consecutive element
            if (nums[i] == nums[i - 1] + 1) {
                current++;
            } else {
                // Sequence breaks
                longest = Math.max(longest, current);
                current = 1;
            }
        }

        return Math.max(longest, current);
    }




}
