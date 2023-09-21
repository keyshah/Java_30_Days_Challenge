// Day 1: Reverse a String Program without using StringBuffer/StringBuilder.

package quiz;

public class Day1_ReverseString {

    public static void main(String[] args) {
        // Original string
        String s1 = "My name is Keyur Shah";

        // Display the original string
        System.out.println("Original String: " + s1);

        // Initialize an empty string for the reversed version
        String revs1 = "";

        // Loop through the original string in reverse and build the reversed string
        for (int i = s1.length() - 1; i >= 0; i--) {
            revs1 = revs1 + s1.charAt(i);
        }

        // Display the reversed string
        System.out.println("Reversed String: " + revs1);
    }
}
