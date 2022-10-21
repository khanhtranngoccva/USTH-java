package Chapter03;

public class IntegerToKaryString {
    public static void main(String[] args) {
        int base;
        try {
            base = Integer.parseInt(args[1]);
        } catch (Throwable e) {
            base = 2;
        }
        int n = Integer.parseInt(args[0]);
        String result = Integer.toString(n, base);
        System.out.println(result);
    }
}
