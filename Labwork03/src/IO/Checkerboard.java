package IO;

public class Checkerboard {
    public static void main(String[] args) {
        int n = 0;

        try {
            n = Integer.parseInt(args[0]);
        } catch (Exception e) {
            n = 5;
        }

        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    StdDraw.setPenColor(255, 255, 255);
                } else {
                    StdDraw.setPenColor(0, 0, 0);
                }
                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
            }
        }

        StdDraw.show();
    }
}
