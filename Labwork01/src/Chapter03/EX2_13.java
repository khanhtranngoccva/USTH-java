package Chapter03;

public class EX2_13 {
    public static void main(String[] args) {
        int n = 123456789;
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }
        System.out.println(m); // 987654321
        System.out.println(n); // 0
    }
}
