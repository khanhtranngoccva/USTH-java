class Automobile {
    double fuel;
    double speed;
    String license;
    public Automobile (double f, double s, String l) {
        this.fuel = f;
        this.speed = s;
        this.license = l;
    }
    public void accelerate(double pedalPressure) {
        if (this.fuel > 0) {
            this.speed += pedalPressure;
        }
    }
    public void decelerate(double pedalPressure) {
        if (this.fuel <= 0) {
            this.speed -= pedalPressure;
        }
    }
    public static void main(String[] args) {
        Automobile a1 = new Automobile(4.5,34,"29JAD");
        a1.accelerate(4);
        a1.decelerate(5);
    }
}