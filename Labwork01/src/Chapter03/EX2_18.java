package Chapter03;

public class EX2_18 {
    public static void main(String[] args) {
        double sum = 0;
        int n = 1000000;
        System.out.println(65536 * 65536);
        for (int i = 1; i <= n; i++) {
            sum = sum + 1 / (1.0 * i * i);
        }
        System.out.println(sum);
    }

}