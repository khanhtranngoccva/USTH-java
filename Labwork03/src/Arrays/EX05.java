package Arrays;

public class EX05 {
    public static void main(String[] args) {
        // Variable declared but the array is not initialized in heap (length?).
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = i * i;
    }
}
