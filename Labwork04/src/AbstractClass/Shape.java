package AbstractClass;

public abstract class Shape {
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
