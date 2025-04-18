package challenges;

public class Challenge1 {
    public void run() {
        boolean isBoolean = true;
        byte age = 25; // byte: 8-bit signed integer (-128 to 127)
        short year = 2025; // short: 16-bit signed integer (-32,768 to 32,767)
        int population = 1000000; // int: 32-bit signed integer
        long distance = 9876543210L; // long: 64-bit signed integer (use 'L' suffix)
        float pi = 3.14f; // float: 32-bit floating point (use 'f' suffix)
        double gravity = 9.80665; // double: 64-bit floating point (more precise)
        char letter = 65; // char: 16-bit Unicode character, can also use: 'A'

        System.out.println("Challenge 1: Primitive Data Types in Java");
        System.out.println("boolean: " + isBoolean);
        System.out.println("byte: " + age);
        System.out.println("short: " + year);
        System.out.println("int: " + population);
        System.out.println("long: " + distance);
        System.out.println("float: " + pi);
        System.out.println("double: " + gravity);
        System.out.println("char (from int 65): " + letter);

        // Why can you just print all of these?
        // Java automatically converts them into strings using 'System.out.println'.
        // This is called 'autoboxing' or implicit conversion to String;

        // Why are those called primitive data types?
        // They are called 'primitive' because they are the most basic data types built into the Java.
        // They are not objects and store simple values directly in memory;

        // Why can't you assign a double to an integer?
        // You can't assign a double to an int because it's a narrowing conversion (loses precision).
        // Java prevents it unless you explicitly cast it;

        // But why can you assign an integer to a char?
        // You can assign an integer to a char if it's within the char range (0–65535).
        // Java will interpret it as the Unicode character with that code;

        // Why can't you assign a long to an int?
        // long big = 10000000000L;
        // int small = (int) big; // You can force it, but it overflows
        // You can't assign a long to an int because it might not fit.
        // A long can hold bigger numbers than an int. You need to cast, but it can cause overflow or data loss;
    }
}
