package COP_3337.Formative;

public class Recursion {
    /*
     * Write a recursive method called sumAll that, given an integer, sums that number with all lower numbers up to zero. Here is the logic:
     * Start with a number and then add that number to one less than itself.
     * Repeat that logic until you hit zero.
     * Once the end condition is encountered, the total sum of all numbers from the starting number down to zero should have been calculated. Print out the result.
     */
    public int sumAll(int n) {
        if (n == 0) return 0;
        return n + sumAll(n - 1);
    }

    /*
     * There are N bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Write a recursive method that is given the number of bunnies and returns the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
     *
     * E.g.,
     * bunnyEars2(0) → 0
     * bunnyEars2(1) → 2
     * bunnyEars2(2) → 5
     */
    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        return (bunnies % 2 == 0 ? 3 : 2) + bunnyEars2(bunnies - 1);
    }

    /*
     * Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
     *
     * array220([1, 2, 20], 0) → true
     * array220([3, 30], 0) → true
     * array220([3], 0) → false
     */
    public boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1) return false;
        return nums[index] == nums[index + 1] * 10 || array220(nums, index + 1);
    }

    /*
     * Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".
     *
     * stringClean("yyzzza") → "yza"
     * stringClean("abbbcdd") → "abcd"
     * stringClean("Hello") → "Helo"
     */
    public String stringClean(String str) {
        if (str.length() <= 1) return str;
        return (str.charAt(0) == str.charAt(1) ? "" : str.charAt(0)) + stringClean(str.substring(1));
    }

    /*
     * Counting the Number of Words in a String (aka. . . String Tokenizing)
     * Write a method that goes through a given string recursively and determine how many words are in it.
     *
     * Use the constraint that there can only be one space between each word.
     * If there are two or more consecutive spaces, you must throw an error.
     */
    public int countWords(String str) {
        if (str.length() == 0) return 1; // Account for the last word (but adds an empty string bug)
        if (str.charAt(0) != ' ' || str.length() < 2) return countWords(str.substring(1));
        if (str.charAt(1) == ' ') throw new RuntimeException("There can only be one space between words");
        return 1 + countWords(str.substring(1));
    }
}