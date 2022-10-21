package Chapter03;

public class FunctionGrowth {
    public static void main(String[] args) {
        for (int i = 16; i <= 2048; i *= 2) {
            Object[] result = {Math.log(i), i, i * Math.log(i), (int) Math.pow(i, 2), (int) Math.pow(i, 3), (int) Math.pow(2, i)};
            for (Object n : result) {
                String s = n.toString();
                String fmt1 = (String) s.subSequence(0, Math.min(s.length(), 13));
                String fmt2 = " ".repeat(Math.max(0, 13 - fmt1.length())) + fmt1;

                System.out.print(fmt2 + " ");
            }
            System.out.println();
        }
    }
}
