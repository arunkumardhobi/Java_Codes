import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class Common21_30 {

    public int[] rotateArrayRight(int[] a, int rotate) {
        rotate = rotate % a.length;

        int[] temp = new int[rotate];

        for (int i = 0; i < rotate; i++) {
            temp[i] = a[a.length - rotate + i];
        }

        for (int i = a.length - rotate - 1; i >= 0; i--) {
            a[i + rotate] = a[i];
        }

        for (int i = 0; i < rotate; i++) {
            a[i] = temp[i];
        }

        return a;
    }

    public boolean checkArrayEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public int[] swapElements(int[] a, int firstIndex, int secondIndex) {
        a[firstIndex] = a[firstIndex] + a[secondIndex];
        a[secondIndex] = a[firstIndex] - a[secondIndex];
        a[firstIndex] = a[firstIndex] - a[secondIndex];

        return a;
    }

    public void splitArrayInHalf(int[] a) {
        int mid = a.length / 2;
        int[] first = Arrays.copyOfRange(a, 0, mid);
        int[] second = Arrays.copyOfRange(a, mid, a.length);

        System.out.println("First half: " + Arrays.toString(first));
        System.out.println("Second half: " + Arrays.toString(second));
    }

    public boolean isPalindrome(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public int[] differenceUsingStream(int[] a, int[] b) {
        return Arrays.stream(a)
                .filter(x -> Arrays.stream(b).noneMatch(y -> y == x))
                .toArray();
    }

    public void printUnionOfArrays(int[] first, int[] second) {
        HashSet<Integer> unionSet = new HashSet<>();

        for (int num : first) {
            unionSet.add(num);
        }
        for (int num : second) {
            unionSet.add(num);
        }

        System.out.println("Union of the two arrays: " + unionSet);
    }

    public HashSet<Integer> intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int n : nums1) {
            set1.add(n);
        }

        for (int n : nums2) {
            if (set1.contains(n)) {
                intersection.add(n);
            }
        }

        return intersection;
    }

    public int findLeastFrequentElement(int[] a) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int value : a) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        int leastElement = a[0];
        int minFrequency = Integer.MAX_VALUE;

        for (Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();

            if (freq < minFrequency) {
                minFrequency = freq;
                leastElement = element;
            }
        }

        return leastElement;
    }

    public char[] leatfrequentelementinarray(int[] inputFromUser) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'leatfrequentelementinarray'");
    }

    public int[] changeTheIndexArray(int[] inputFromUser, int arrayElementFromUser, int arrayElementFromUser2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changeTheIndexArray'");
    }

    public int[] rotedArrayByGivenNumberRight(int[] inputFromUser, int arrayElementFromUser) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rotedArrayByGivenNumberRight'");
    }

    public void unionElementofArrays(int[] inputFromUser, int[] inputFromUser2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'unionElementofArrays'");
    }
}
