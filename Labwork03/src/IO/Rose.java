package IO;

public class Rose {
    public static void main(String[] args) {
        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (Exception e) {
            n = 4;
        }
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.setPenColor(255, 195, 52);
        double xPrev = 0, yPrev = 0;
        for (double t = 0.0; t < 360.0; t += 0.1) {
            double radius = Math.sin(n * t);
            double xNew = radius * Math.cos(t);
            double yNew = radius * Math.sin(t);
            StdDraw.line(xPrev, yPrev, xNew, yNew);
            xPrev = xNew;
            yPrev = yNew;
        }
    }
}
