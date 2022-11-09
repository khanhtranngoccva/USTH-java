package AbstractClass;

public class Point extends Shape {
    private static int pointNumber = 0;

    protected double x;
    protected double y;

    public Point(double x, double y) {
        super("AbstractClass.Point " + pointNumber);
        this.x = x;
        this.y = y;
        Point.pointNumber++;
    }

    public Point(double x, double y, String name) {
        super(name);
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return this.name;
    }

    public void display() {
        System.out.format("Name: %s, X: %f, Y: %f\n", this.name, this.x, this.y);
    }

    public void displayComputed() {
        System.out.format("Name: %s, Area: %f, Volume: %f\n", this.name, this.calArea(), this.calVolume());
    }
}
