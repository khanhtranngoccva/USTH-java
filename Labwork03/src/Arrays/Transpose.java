package Arrays;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        Object[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 1 4 7
        // 2 5 8
        // 3 6 9
        Transpose.transposeSquare(array);
        Transpose.printNestedArray(array);
    }

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

    public static Object[][] transposeSquare(Object[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                Object tmp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = tmp;
            }
        }
        return array;
    }

    public static void printNestedArray(Object[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

}
