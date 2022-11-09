import AbstractClass.Circle;

class Circle2 extends Circle {
    public Circle2(double x, double y, double radius) {
        super(x, y, radius);
    }

    @Override
    public void display() {
        System.out.println(this.x);
    }
}

class Circle3 extends Circle2 {
    public Circle3(double x, double y, double radius) {
        super(x, y, radius);
    }

    @Override
    public void display() {
        System.out.println(this.x);
    }
}


class Main {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(0, 0, 2);
    }
}
