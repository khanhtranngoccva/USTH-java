package AbstractClass;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Shape[] shapes = {new Point(1, 2), new Circle(0, 0, 2.5), new Cylinder(1, 1, 1, 2)};
        for (Shape shape : shapes) {
            shape.displayComputed();
        }
    }
}