import java.util.Hashtable;

public class EX3 {
    static final Hashtable<Character, Integer> COLOR_MAP = new Hashtable<>();
    static final char[] COLOR_REVERSE_MAP = {'G', 'R', 'B'};

    public static int combine(int n1, int n2) {
        return n1 == n2 ? n1 : 3 - n1 - n2;
    }

    public static void main(String[] args) {
        COLOR_MAP.put('G', 0);
        COLOR_MAP.put('R', 1);
        COLOR_MAP.put('B', 2);
        System.out.println(triangle("RRRRBGBGBGBRGB"));
    }

    public static char triangle(final String row) {
        int highestVerticalPosition = row.length() - 1;
        char[] rowArray = row.toCharArray();

        class LocalSolver {
            public int computeBestMove(int verticalPosition) {
                int maxPossibleStep = highestVerticalPosition - verticalPosition;
                int i = 1, j = 1;   
                while (i <= maxPossibleStep) {
                    j = i;
                    i *= 3;
                }
                return j;
            }

            public int computeAtPoint(int horizontalPosition, int verticalPosition) {
                if (verticalPosition == highestVerticalPosition) {
                    return COLOR_MAP.get(rowArray[horizontalPosition]);
                }
                int stepsToMove = computeBestMove(verticalPosition);
                int leftResult = computeAtPoint(horizontalPosition, verticalPosition + stepsToMove);
                int rightResult = computeAtPoint(horizontalPosition + stepsToMove, verticalPosition + stepsToMove);
                return combine(leftResult, rightResult);
            }
        }

        return COLOR_REVERSE_MAP[new LocalSolver().computeAtPoint(0, 0)];
    }
}