package Chapter03;

import java.util.Objects;

public class AllEqual {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new RuntimeException("Argument not found.");
        } else {
            String a1 = args[0];
            for (String arg : args) {
                if (!Objects.equals(arg, a1)) {
                    System.out.println(false);
                    return;
                }
            }
            System.out.println(true);
        }
    }
}
