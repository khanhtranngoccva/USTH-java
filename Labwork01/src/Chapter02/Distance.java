package Chapter02;

public class Distance {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        System.out.println("The hypotenuse is: " + Math.sqrt(Math.pow(a, 2) + Math.pow(b,  2)));
    }
}
