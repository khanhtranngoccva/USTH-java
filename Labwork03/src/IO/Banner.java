package IO;

import java.awt.Font;

public class Banner {
    public static void main(String[] args) {
        String input;
        try {
            input = args[0];
        } catch (Exception e) {
            input = "Robloxian!";
        }

        Font mainFont = new Font("Lato", Font.BOLD, 120);
        StdDraw.setPenColor(0, 0, 0);
        StdDraw.enableDoubleBuffering();

        for (double i = 0.0; true; i += 0.001) {
            StdDraw.clear(StdDraw.WHITE);
            StdDraw.text((i % 1.0),       0.5, input);
            StdDraw.text((i % 1.0) - 1.0, 0.5, input);
            StdDraw.text((i % 1.0) + 1.0, 0.5, input);
            StdDraw.pause(15);
            StdDraw.show();
        }
//        StdDraw.text(0, 0, input);
//        StdDraw.show();
    }
}
