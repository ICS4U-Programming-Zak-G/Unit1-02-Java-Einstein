// Import scanner class to get input.
import java.util.Scanner;

/** .
* Calculate energy released with mass using Einstein's equation E = mc^2.
*
* @author  Zak Goneau
* @version 1.0
* @since   2025-02-14
*/

// Creating class
public final class Einstein {
    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Einstein() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */

    public static void main(final String[] args) {

        // Declare constants
        final double SPEED_OF_LIGHT = 299792458;

        // Welcome and get user input
        System.out.print("This program calculates the energy released");
        System.out.println(" with a certain mass using E = mc^2");
        System.out.println("Enter a mass (kg): ");

        // Using scanner to get user input
        final Scanner scanner = new Scanner(System.in);
        final String massString = scanner.nextLine();

        // Try to convert users input
        try {

            // Convert string to float
            double massDouble = Double.parseDouble(massString);

            // Check if input is less than 0
            if (massDouble < 0) {

                // Print result to user
                System.out.print(massDouble);
                System.out.println(" is negative which is invalid. ");

            // Otherwise valid input
            } else {

                // Calculate energy released and print to user
                double energy = massDouble * (Math.pow(SPEED_OF_LIGHT, 2));
                System.out.print("The energy released of an object with a ");
                System.out.print("mass of " + massDouble + "kg is: ");
                System.out.format("%.3e", energy);
                System.out.print("J");
                System.out.println();
            }

        // Catch invalid inputs and tell user
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid input. "
                    + error.getMessage());
        }

        // Close scanner
        scanner.close();
    }
}
