package COP_3337.Formative;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exceptions {
    /*
     * You've been hired to create an application.
     * This application requires that you ask for and record the user's first name, last name, and age in years.
     * What would you do to ensure that the data that is entered is valid? (Without the program crashing) If incorrect data is entered, then prompt the user again until valid data is submitted.
     */
    public void main() {
        Scanner input = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (inputs.size() != 3) {
            if (inputs.size() == 0) System.out.println("Enter your first name: ");
            else if (inputs.size() == 1) System.out.println("Enter your last name: ");
            else System.out.println("Enter your age: ");

            try { // if this throws an error it will never be saved to the list (no progress)
                String inputString = input.nextLine();
                input.nextLine(); // clear the buffer
                if (inputString.length() == 2) Integer.valueOf(inputString);
                inputs.add(inputString);
            } catch (Exception e) {System.out.println("Invalid input. Please try again.");}
        }

        System.out.println("Your name is " + inputs.get(0) + " " + inputs.get(1) + " and you are " + inputs.get(2) + " years old.");
    }
}
