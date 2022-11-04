package IO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Stats {
    public static void main(String[] args) {
        ArrayList<Float> floats = new ArrayList<Float>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                floats.add(scanner.nextFloat());
            } catch (Exception e) {
                break;
            }
        }

        float sum = 0;
        for (int i = 0; i < floats.size(); i++) {
            sum += floats.get(i);
        }
        float mean = sum / floats.size();
        float variance = 0;
        for (int i = 0; i < floats.size(); i++) {
            variance += Math.pow(floats.get(i) - mean, 2);
        }
        variance /= floats.size();
        double stdev = Math.sqrt(variance);
        System.out.println(stdev);
    }
}
