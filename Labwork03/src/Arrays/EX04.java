package Arrays;

import java.util.Arrays;

public class EX04 {
    public static Object[] reverseArray(Object[] arr) {
        int arrLength = arr.length;
        // If array is odd length (5): 0, 1, 2, 3, 4, middle index is 2.
        // Even length (4): 0, 1, 2, 3, middle index is 2.
        for (int i = 0; i < arrLength / 2; i++) {
            int j = arrLength - 1 - i;
            Object tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] array = {"Tom", "Jerry", "Spike", "Pike"};
        System.out.println(Arrays.toString(reverseArray(array)));
    }
}
