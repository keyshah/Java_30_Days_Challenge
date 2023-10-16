// Day 27 - Swap First and Last Letter in a String in Java

package quiz;

public class Day27_SwapFirstLastLetter {

    public static void main(String[] args) {
        String input = "hello";
        String swappedString = swapFirstAndLastLetter(input);
        System.out.println("String after swapping first and last letter: " + swappedString);
    }

    public static String swapFirstAndLastLetter(String input) {
        if (input == null || input.length() < 2) {
            return input;
        }

        char[] charArray = input.toCharArray();
        char firstLetter = charArray[0];
        char lastLetter = charArray[input.length() - 1];

        charArray[0] = lastLetter;
        charArray[input.length() - 1] = firstLetter;

        return new String(charArray);
    }
}
