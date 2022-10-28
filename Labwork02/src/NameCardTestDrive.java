public class NameCardTestDrive {
    public static void main(String[] args) {
        NameCard c1 = new NameCard("Polly Morfism", "555-0343", "pm@wickedlysmart.com");
        System.out.println(c1);
    }
}

class NameCard {
    protected String name;
    protected String phone;
    protected String email;

    public NameCard(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "*".repeat(20) + "\n"
                + "Name: " + this.name + "\n"
                + "Phone: " + this.phone + "\n"
                + "eMail: " + this.email + "\n"
                + "*".repeat(20);
    }
}