package AbstractClass;

public class Cylinder extends Circle {
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
