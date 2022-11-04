package IO;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class LongestRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Object> data = new ArrayList<>();

        while (true) {
            try {
                data.add(scanner.nextInt());
            } catch (Exception e) {
                break;
            }
        }

        Object[] result = LongestRun.longestRun(data);

        System.out.println(result[1] + " repeated " + result[0] + " times!");
    }

    public static Object[] longestRun(ArrayList<Object> args) {
        int longestRun = 0, currentRun = 0;
        Object longestRunValue = null, currentRunValue = null;
        for (Object arg : args) {
            if (currentRun == 0) {
                // Initialization if there's no runs yet.
                longestRunValue = arg;
                currentRunValue = arg;
                currentRun++;
            } else if (!arg.equals(currentRunValue)) {
                // Prepare to overwrite the last record.
                if (currentRun > longestRun) {
                    longestRun = currentRun;
                    longestRunValue = currentRunValue;
                }
                currentRunValue = arg;
                currentRun = 1;
            } else {
                currentRun++;
            }
        }
        // Handles the final item because the last item has no item to check if mismatch.
        if (currentRun > longestRun) {
            longestRun = currentRun;
            longestRunValue = currentRunValue;
        }
        return new Object[]{longestRun, longestRunValue};
    }
}
