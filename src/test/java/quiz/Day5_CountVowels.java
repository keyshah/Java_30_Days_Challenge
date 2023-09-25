// Day 5 - Count Vowels in a String in Java

package quiz;

public class Day5_CountVowels {

    public static void main(String[] args) {
        String inputString = "Hello, I'm Keyur Shah, a QA enthusiast with a passion for exploration.";
        int vowelCount = countVowels(inputString);
        System.out.println("The number of vowels in the string: " + vowelCount);
    }

    public static int countVowels(String inputString) {
        inputString = inputString.toLowerCase(); // Convert the string to lowercase for accurate counting
        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }
}
