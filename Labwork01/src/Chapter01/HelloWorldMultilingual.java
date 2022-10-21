package Chapter01;

public class HelloWorldMultilingual {
    public static void main(String[] args) {
        String[] phrases = {
            "Hello world!",
            "Hallo Welt!",
            "Xin chào thế giới!",
            "Bonjour le monde!",
        };
        for (String phrase : phrases) {
            System.out.println(phrase);
        }
    }
}
