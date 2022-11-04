package IO;

class Point {
    public double mass;
    public double x;
    public double y;

    Point(double mass, double x, double y) {
        this.mass = mass;
        this.x = x;
        this.y = y;
    }
}


public class Centroid {
    public static void main(String[] args) {
        Point[] points = {
                new Point(1, 2, 3),
                new Point(1, 4, 5),
                new Point(1, 7, 0),
        };
    }

    public static double[] centerOfMass(Point[] points) {
        double weightedTotalX = 0;
        double weightedTotalY = 0;
        for (Point point : points) {
            weightedTotalX += point.mass * point.x;
            weightedTotalY += point.mass * point.y;
        }
        return new double[] {weightedTotalX / points.length, weightedTotalY / points.length};
    }
}
