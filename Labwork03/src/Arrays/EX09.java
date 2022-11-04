package Arrays;

public class EX09 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 1, 2, 3 };
        // False because the variables refers to different locations in memory
        System.out.println(a == b);
    }
}
