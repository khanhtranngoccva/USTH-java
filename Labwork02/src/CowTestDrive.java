public class CowTestDrive {
    public static void main(String[] args) {
        Cow c1 = new Cow("Jerry", "American angus", 2);
        c1.age = 4;
        c1.moo();
    }
}

class Cow {
    public String name;
    public String breed;
    public int age;

    public Cow(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void moo() {
        System.out.println("Moo...!");
    }
}