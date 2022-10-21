package Chapter03;

public class Hellos {
    public static void main(String[] args) {
        int times = Integer.parseInt(args[0]);
        for (int i = 0; i < times; i++) {
            int mod100 = i % 100;
            int mod10 = i % 10;
            String result = i + "";
            if (mod100 >= 11 && mod100 <= 20) {
                result += "th";
            } else if (mod10 == 1) {
                result += "st";
            } else if (mod10 == 2) {
                result += "nd";
            } else if (mod10 == 3) {
                result += "rd";
            } else {
                result += "th";
            }
            result += " Hello!";
            System.out.println(result);
        }
    }
}
