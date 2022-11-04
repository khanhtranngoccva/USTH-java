package IO;

import java.awt.Color;

public class Circles {
    public static double randomDouble(double min, double max) {
        return min + Math.random() * (max - min);
    }

    public static Color pickBlack(double probability) {
        if (Math.random() < probability) {
            return new Color(0, 0, 0);
        }
        return new Color(255, 255, 255);
    }

    public static void main(String[] args) {
        int circleCount;
        double probabilityBlack;
        double minRadius;
        double maxRadius;
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
        if (args.length == 0) {
            circleCount = 200;
            probabilityBlack = 1;
            minRadius = 0.01;
            maxRadius = 0.01;
        } else {
            circleCount = Integer.parseInt(args[0]);
            probabilityBlack = Double.parseDouble(args[1]);
            minRadius = Double.parseDouble(args[2]);
            maxRadius = Double.parseDouble(args[3]);
        }
        for (int i = 0; i < circleCount; i++) {
            StdDraw.setPenColor(pickBlack(probabilityBlack));
            StdDraw.filledCircle(randomDouble(0, 1), randomDouble(0, 1), randomDouble(minRadius, maxRadius));
        }
    }
}
