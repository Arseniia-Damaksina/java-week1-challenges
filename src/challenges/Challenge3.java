package challenges;

public class Challenge3 {
    public void run() {
        System.out.println("Challenge 3: Hello Arrays with Primitive Data Types");

        boolean[] booleans = {true, false};
        byte[] ages = {25, 30};
        short[] years = {2023, 2025};
        int[] populations = {1_000_000, 2_000_000};
        long[] distances = {9_876_543_210L, 1_234_567_890L};
        float[] floats = {3.14f, 2.71f};
        double[] doubles = {9.80665, 1.61803};
        char[] letters = {'A', 66}; // 66 = 'B'

        System.out.println("boolean[]: ");
        for (boolean b : booleans) System.out.println(" - " + b);

        System.out.println("byte[]: ");
        for (byte b : ages) System.out.println(" - " + b);

        System.out.println("short[]: ");
        for (short s : years) System.out.println(" - " + s);

        System.out.println("int[]: ");
        for (int i : populations) System.out.println(" - " + i);

        System.out.println("long[]: ");
        for (long l : distances) System.out.println(" - " + l);

        System.out.println("float[]: ");
        for (float f : floats) System.out.println(" - " + f);

        System.out.println("double[]: ");
        for (double d : doubles) System.out.println(" - " + d);

        System.out.println("char[]: ");
        for (char c : letters) System.out.println(" - " + c);

        // Primitive types are the most basic data types in Java;
        // They hold raw values and are stored directly in memory, not as objects.;
        // You can print them directly using System.out.println because Java automatically converts them to strings;
        // You can't assign a double to an int without casting because of potential data loss;
        // You can assign an int to a char if it's in the range 0–65535 (Unicode);
        // A long can't be assigned to an int without casting because it may exceed int's range;
    }
}