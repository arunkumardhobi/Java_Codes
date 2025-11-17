import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Comman10_20 {
    public static final Scanner sc = new Scanner(System.in);

    public void printSecondLargestElement(int[] a) {
        double largest = a[0];
        double secondLargest = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (secondLargest < a[i] && largest > a[i]) {
                secondLargest = a[i];
            }
        }

        System.out.println("Second largest element is: " + secondLargest);
        System.out.println("Largest element is: " + largest);
    }

    public int secondSmallestElement(int[] a) {
        int smallest = a[0];
        int secondSmallest = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            } else if (secondSmallest > a[i] && smallest < a[i]) {
                secondSmallest = a[i];
            }
        }
        return secondSmallest;
    }

    public int[] mergeTwoArrays(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            merged[a.length + i] = b[i];
        }

        return merged;
    }

    public void printUniqueElements(int[] a) {
        HashSet<Integer> unique = new HashSet<>();

        for (int value : a) {
            unique.add(value);
        }

        for (int value : unique) {
            System.out.println("Unique value: " + value);
        }
    }

    public int[] rotateLeftByOne(int[] a) {
        return IntStream.concat(
                Arrays.stream(a).skip(1),
                IntStream.of(a[0])
        ).toArray();
    }

    public int[] rotateRightByOne(int[] a) {
        int temp = a[a.length - 1];

        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = temp;
        return a;
    }

    public int[] insertElementInArray(int[] a, int position, int element) {
        int[] newArray = new int[a.length + 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = a[i];
        }

        newArray[position] = element;

        for (int i = position; i < a.length; i++) {
            newArray[i + 1] = a[i];
        }

        return newArray;
    }

    public int[] deleteElementInArray(int[] a, int position) {
        int[] newArray = new int[a.length - 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = a[i];
        }

        for (int i = position; i < newArray.length; i++) {
            newArray[i] = a[i + 1];
        }

        return newArray;
    }

    public HashMap<Integer, Integer> frequencyCount(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int value : a) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        return map;
    }

    public void printFrequencyMap(HashMap<Integer, Integer> frequencyCount) {
        System.out.println("Frequency of each element:");

        for (int key : frequencyCount.keySet()) {
            System.out.println(key + " : " + frequencyCount.get(key));
        }
    }

    public int findMostFrequentElement(int[] a) {
        HashMap<Integer, Integer> frequencyCount = new HashMap<>();

        for (int value : a) {
            frequencyCount.put(value, frequencyCount.getOrDefault(value, 0) + 1);
        }

        int mostFrequentElement = a[0];
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyCount.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFrequency) {
                maxFrequency = freq;
                mostFrequentElement = element;
            }
        }

        return mostFrequentElement;
    }

    public static void main(String[] args) {
    }

    public void uniqcharector(int[] inputFromUser) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'uniqcharector'");
    }

    public void displayMap(HashMap<Integer,Integer> frequencyCount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayMap'");
    }

    public String maxfrequencyofElement(int[] inputFromUser) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maxfrequencyofElement'");
    }
}
