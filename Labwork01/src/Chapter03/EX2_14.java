package Chapter03;

public class EX2_14 {
    public static void main(String[] args) {
        int f = 0, g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f); // The Fibonacci sequence.
            f = f + g;
            g = f - g;
        }
    }
}
