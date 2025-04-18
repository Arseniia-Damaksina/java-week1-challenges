import challenges.Challenge1;
import challenges.Challenge2;
import challenges.Challenge3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Java Challenge Runner ===");
        System.out.println("Select a challenge to run:");
        System.out.println("1 - Primitive Data Types (Challenge1)");
        System.out.println("2 - Wrapper Object Types (Challenge2)");
        System.out.println("3 - Arrays with Primitive Types (Challenge3)");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                new Challenge1().run();
                break;
            case 2:
                new Challenge2().run();
                break;
            case 3:
                new Challenge3().run();
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }

        scanner.close();
    }
}