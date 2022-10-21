package Chapter03;

public class RollLoadedDie {
    static int genDice() {
        return (int) (Math.floor(Math.random() * 8) + 1);
    }

    static void roll() {
        int result = genDice();
        if (result >= 6) {
            System.out.println(6);
        } else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            roll();
        }
    }
}