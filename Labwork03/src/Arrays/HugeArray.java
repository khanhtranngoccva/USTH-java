package Arrays;

public class HugeArray {
    // Causes integer overflow.
    public static void main(String[] args) {
        int n = 1000;
        // n ** 4 throws an error at runtime because of integer overflow.
        int[] a = new int[n*n*n*n];
        System.out.println(a.length);
    }
}