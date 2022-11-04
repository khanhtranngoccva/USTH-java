package IO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;

public class MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                integers.add(scanner.nextInt());
            } catch (Exception e) {
                break;
            }
        }

        System.out.println(Collections.max(integers));
    }
}
