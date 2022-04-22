package COP_3337.Formative;

import java.util.Scanner;

public class RichterScale {
    /*
     * This program is designed to determine the magnitude of an earthquake based on the Richter scale.
     *
     * Print out the following depending on if the parameter is equals to or higher
     * 8 - Most structures fall
     * 7 - Many buildings destroyed
     * 6 - Many buildings considerably destroyed
     * 4.5 - Damage to poorly constructed buildings
     * Everything else - No destruction to buildings
     */
    public void main() {
        Scanner input = new Scanner(System.in);
        Double magnitude = null;

        while (magnitude == null) { // Keep asking for a valid input until a valid input is entered
            try {
                System.out.print("Enter the magnitude of the earthquake: ");
                magnitude = input.nextDouble();
            } catch (Exception e) {System.out.println("Invalid input. Please enter a number.");}
        }

        if (magnitude >= 8)  System.out.println("Most structures fall");
        else if (magnitude >= 7) System.out.println("Many buildings destroyed");
        else if (magnitude >= 6) System.out.println("Many buildings considerably destroyed");
        else if (magnitude >= 4.5) System.out.println("Damage to poorly constructed buildings");
        else System.out.println("No destruction to buildings");
    }
}
