import com.sun.tools.jconsole.JConsoleContext;

public class VectorTestDrive {
    public static void main(String[] args) {
        Vector v1 = new Vector(1, 2);
        Vector v2 = new Vector(4, -4);
        System.out.println(v1);
        System.out.println(v2);
        Vector v3 = v1.add(v2);
        Vector v4 = v1.subtract(v2);
        int i5 = v1.multiply(v2);

        System.out.println(v3);
        System.out.println(v4);
        System.out.println(i5);
    }
}

class Vector {
    public int x;
    public int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector add(Vector otherVector) {
        return new Vector(this.x + otherVector.x, this.y + otherVector.y);
    }

    public Vector subtract(Vector otherVector) {
        return new Vector(this.x - otherVector.x, this.y - otherVector.y);
    }

    public int multiply(Vector otherVector) {
        return this.x * otherVector.x + this.y * otherVector.y;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
