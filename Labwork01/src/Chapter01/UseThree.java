package Chapter01;

import java.text.MessageFormat;

public class UseThree {
    public static void main(String[] args) {
        System.out.println(MessageFormat.format("Hello {0}, {1} and {2}!", (Object[]) args));
    }
}