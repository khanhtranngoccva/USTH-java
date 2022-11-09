package AbstractClass;

abstract class Shape {
    protected String name;

    protected Shape(String name) {
        this.name = name;
    }

    protected double calArea() {
        return 0;
    }

    protected double calVolume() {
        return 0;
    }

    abstract public String getName();

    abstract public void display();

    abstract public void displayComputed();
}

class Point extends Shape {
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

class Circle extends Point {
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

class Cylinder extends Circle {
    private static int cylinderNumber = 0;

    protected double height;

    public Cylinder(double x, double y, double radius, double height) {
        super(x, y, radius, "AbstractClass.Cylinder " + cylinderNumber);
        this.height = height;
        Cylinder.cylinderNumber++;
    }

    public Cylinder(double x, double y, double radius, double height, String name) {
        super(x, y, radius, name);
        this.height = height;
    }

    @Override
    public double calArea() {
        double baseArea = this.radius * this.radius * Math.PI;
        double lateralArea = this.radius * 2 * Math.PI * this.height;
        return baseArea * 2 + lateralArea;
    }

    @Override
    public double calVolume() {
        return super.calArea() * this.height;
    }

    @Override
    public void display() {
        System.out.format("Name: %s, X: %f, Y: %f, Radius: %f, Height: %f\n", this.name, this.x, this.y, this.radius, this.height);
    }
}

public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape[] shapes = {new Point(1, 2), new Circle(0, 0, 2.5), new Cylinder(1, 1, 1, 2)};
        for (Shape shape : shapes) {
            shape.displayComputed();
        }
    }
}