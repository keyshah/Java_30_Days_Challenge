// Day 8 - Find Length of String without using length() method in Java

package quiz;

public class Day8_FindStringLengthWithoutLengthMethod {

    public static void main(String[] args) {
        String inputString = "Hello, World - My name is Keyur Shah";
        int length = findStringLength(inputString);
        System.out.println("The length of the string is: " + length);
    }

    public static int findStringLength(String inputString) {
        int count = 0;

        // Iterate through the characters of the string until the end is reached
        try {
            while (true) {
                inputString.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Catch the exception when the end of the string is reached
           // System.out.println(e);
        }

        return count;
    }
}
