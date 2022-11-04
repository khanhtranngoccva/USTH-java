package IO;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(wordCount(scanner.nextLine()));
    }

    public static int wordCount(String arg) {
        String[] array = arg.split("\s");
        return array.length;
    }


}
