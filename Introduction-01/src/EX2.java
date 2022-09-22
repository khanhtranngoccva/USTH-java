import java.util.Arrays;

public class EX2 {
    public static void main(String[] args) {
        String[] colors = {"black", "white"};
        Dog dog = new Dog("Terrier", colors);
        dog.printName();
        dog.printColors();
    }
}

class Dog {
    private final String name;
    private final String[] colors;

    public Dog(String name, String[] colors) {
        this.name = name;
        this.colors = colors;
    }

    public void printName() {
        System.out.println(this.name);
    }

    public void printColors() {
        for (String color : this.colors) {
            System.out.println(color);
        }
    }
}