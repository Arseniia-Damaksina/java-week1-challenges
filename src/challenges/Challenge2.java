package challenges;

public class Challenge2 {
    public void run() {
        System.out.println("Challenge 2: Object Versions of Primitive Data Types");

        // These are wrapper classes types, so yellow warning
        Boolean isBoolean = true;
        Byte age = 25;
        Short year = 2025;
        Integer population = 1_000_000;
        Long distance = 9_876_543_210L;
        Float pi = 3.14f;
        Double gravity = 9.80665;
        Character letter = 65;

        Object[] values = {isBoolean, age, year, population, distance, pi, gravity, letter};

        for (Object value : values) {
            System.out.println(value);
        }

        // These are wrapper classes (objects) for primitive types;
        // Since they are objects, we can store them in an Object array and loop through;
        // This isn't possible with primitive types because they aren't objects;
    }
}