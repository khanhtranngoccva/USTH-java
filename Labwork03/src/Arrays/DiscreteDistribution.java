package Arrays;

public class DiscreteDistribution {
    public static void main(String[] args) {
        int length = args.length;
        int sampleSpace = (1 + args.length) * args.length / 2;

        class RNG {
            public void generate() {
                double randomVar = Math.random();
                double accumulator = 0;

                // 1/36, 3/36, 6/36
                int i;
                for (i = 1; i <= length; i++) {
                    accumulator += i / (sampleSpace * 1.0);
                    if (randomVar < accumulator) {
                        break;
                    }
                }
                System.out.println(args[i - 1]);
            }
        }

        RNG rng = new RNG();
        for (int i = 0; i <= 200; i++) {
            rng.generate();
        }
    }
}
