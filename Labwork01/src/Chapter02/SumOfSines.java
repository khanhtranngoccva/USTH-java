package Chapter02;

public class SumOfSines {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new RuntimeException("Argument not found.");
        } else {
            double t = Double.parseDouble(args[0]);
            System.out.println(Math.sin(2 * t) + Math.sin(3 * t));
        }
    }
}
