package Chapter02;

public class SumOfTwoDice {
    static int genDice() {
        return (int) (Math.floor(Math.random() * 6) + 1);
    }

    public static void main(String[] args) {
        System.out.println("The total sum of 2 dices is: " + (genDice() + genDice()));
    }
}
