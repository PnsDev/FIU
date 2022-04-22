package COP_3337.Formative;

import java.util.Scanner;

public class Sentinel {
    /*
     * Write a program that repeatedly prompts the user for words until the user types "goodbye", then outputs the longest word that was typed.
     * –(In this case, "goodbye" is the sentinel value.)
     *
     * Type a word (or "goodbye" to quit): Obama
     * Type a word (or "goodbye" to quit): McCain
     * Type a word (or "goodbye" to quit): Biden
     * Type a word (or "goodbye" to quit): Palin
     * Type a word (or "goodbye" to quit): goodbye
     * The longest word you typed was "McCain" (6 letters)
     */
    public void main() {
        Scanner input = new Scanner(System.in);
        String longestWord = "";

        while (true) {
            System.out.print("Type a word (or \"goodbye\" to quit): ");
            String word = input.nextLine().split(" ")[0];
            if (word.equals("goodbye")) break;
            if (word.length() > longestWord.length()) longestWord = word;
        }

        System.out.println("The longest word you typed was \"" + longestWord + "\" (" + longestWord.length() + " letters)");
    }
}
