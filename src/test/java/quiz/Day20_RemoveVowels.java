// Day 20 - Remove Vowels from a String in Java

package quiz;

public class Day20_RemoveVowels {

    public static void main(String[] args) {
        String input = "Keyur Shah";
        String withoutVowels = removeVowels(input);
        System.out.println("String without vowels: " + withoutVowels);
    }

    public static String removeVowels(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!isVowel(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
