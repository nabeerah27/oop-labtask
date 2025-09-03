package Week09_Birthday_Paradox.code;

import java.util.Scanner;

public class Utils {

    private static Scanner sc = new Scanner(System.in);

    public static int inputNumPeoples() {
        int numPeople;
        do
        {
            System.out.print("Enter the number of persons in room: ");
            numPeople = sc.nextInt();

            if (numPeople <= 0)
            {
                System.out.println("Invalid input. Number of people must be positive.");
            }

        } while (numPeople <= 0);
        return numPeople;
    }

    public static int inputTrials() {
        int trials;
        do
        {
            System.out.print("How many times you want to repeat searching?: ");
            trials = sc.nextInt();

            if (trials <= 0)
            {
                System.out.println("Invalid input. Number of people must be positive.");
            }

        } while (trials <= 0);
        return trials;
    }

    // Method to print a table row with centered text
    public static void printRow(String col1, String col2, String col3) {
        System.out.printf("%s | %s | %s%n", centerText(col1, 17),
                centerText(col2, 12), centerText(col3, 17));
    }

    // Helper method to center text in a fixed width
    private static String centerText(String text, int width) {

        // Calculates how much total empty space is needed to make the text fit inside the given column width.
        int padding = width - text.length();

        // Divides the total padding roughly half for the left side.
        int padLeft = padding / 2;

        // The remaining padding goes to the right side.
        int padRight = padding - padLeft;

        // Combines left spaces + text + right spaces, producing a centered string
        return " ".repeat(Math.max(0, padLeft)) + text + " ".repeat(Math.max(0, padRight));

    }
}
