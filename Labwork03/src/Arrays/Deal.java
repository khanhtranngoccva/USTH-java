package Arrays;

import java.util.Arrays;
class PokerGame {
    private static String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static String[] suits = {"♥", "♦", "♠", "♣"};
    private String[][] cardLoadout;
    private static Object[] shuffleArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = (int) Math.floor(Math.random() * array.length);
            Object tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
        }
        return array;
    }

    public void printCardLoadout() {
        for (int i = 0; i < this.cardLoadout.length; i++) {
            System.out.println(Arrays.toString(this.cardLoadout[i]));
        }
    }

    PokerGame(int players) {
        if (players * 5 > numbers.length * suits.length) {
            throw new RuntimeException("Too many players!");
        }

        String[] cards = new String[numbers.length * suits.length];
        int i = 0;
        for (String number : numbers) {
            for (String suit : suits) {
                cards[i] = number + suit;
                i++;
            }
        }

        PokerGame.shuffleArray(cards);

        this.cardLoadout = new String[players][5];

        for (int player = 0; player < players; player++) {
            for (int c = 0; c < 5; c++) {
                this.cardLoadout[player][c] = cards[5 * player + c];
            }
        }
        
        this.printCardLoadout();
    }
}

public class Deal {
    public static void main(String[] args) {
        int players;
        try {
            players = Integer.parseInt(args[0]);
        } catch (Exception e) {
            players = 5;
        }
        new PokerGame(players);
    }
}
