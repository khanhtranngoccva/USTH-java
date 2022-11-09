package AbstractClass;

public class Circle extends Point {
    private static int circleNumber = 0;

    protected double radius;

    public Circle(double x, double y, double radius) {
        super(x, y, "AbstractClass.Circle " + circleNumber);
        this.radius = radius;
        Circle.circleNumber++;
    }

    public Circle(double x, double y, double radius, String name) {
        super(x, y, name);
        this.radius = radius;
    }

    @Override
    public double calArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public void display() {
        System.out.format("Name: %s, X: %f, Y: %f, Radius: %f\n", this.name, this.x, this.y, this.radius);
    }
}
