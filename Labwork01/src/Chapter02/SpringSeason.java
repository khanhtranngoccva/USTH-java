package Chapter02;

public class SpringSeason {
    public static void main(String[] args) {
        int d = 31;
        int m = 5;
        if (m > 6 || m < 3) {
            System.out.println(false);
        } else if (m == 3 && d < 20) {
            System.out.println(false);
        } else if (m == 6 && d > 20) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
