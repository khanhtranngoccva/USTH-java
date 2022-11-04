package IO;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Closest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rp1 = scanner.nextLine().split("\s");
        String[] rp2 = scanner.nextLine().split("\s");

        Object[] p1 = Arrays.stream(rp1)
                .map(Double::parseDouble).toArray();
        Object[] p2 = Arrays.stream(rp2)
                .map(Double::parseDouble).toArray();

        System.out.println(closest(p1, p2));
    }

    public static double closest(Object[] p1, Object[] p2) {
        double x1 = (double) p1[0],
                y1 = (double) p1[1],
                z1 = (double) p1[2],
                x2 = (double) p2[0],
                y2 = (double) p2[1],
                z2 = (double) p2[2];
        double dx = x2 - x1,
                dy = y2 - y1,
                dz = z2 - z1;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}
