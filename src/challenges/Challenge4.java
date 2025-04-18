package challenges;

import java.util.Random;

public class Challenge4 {
    public void run() {
        System.out.println("Challenge 4: Hello Exceptions — Divide Integers with Safety");

        Integer[] numbers = new Integer[10];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(6);
        }

        System.out.print("Generated array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < numbers.length; i++) {
            try {
                int previous = (i == 0) ? numbers[i] : numbers[i - 1];
                int result = numbers[i] / previous;
                System.out.println("numbers[" + i + "] (" + numbers[i] + ") / " +
                        "numbers[" + (i == 0 ? i : i - 1) + "] (" + previous + ") = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide " + numbers[i] + " by 0 at index " + (i == 0 ? i : i - 1));
            }
        }
    }
}