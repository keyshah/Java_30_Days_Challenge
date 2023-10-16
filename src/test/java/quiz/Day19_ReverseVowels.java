// Day 19 - Reverse Vowels of a String in Java

package quiz;

import java.util.HashSet;
import java.util.Set;

public class Day19_ReverseVowels {

    public static void main(String[] args) {
        String input = "KeyurShah";
        String reversedVowels = reverseVowels(input);
        System.out.println("String with reversed vowels: " + reversedVowels);
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            while (left < right && !vowels.contains(chars[left])) {
                left++;
            }

            while (left < right && !vowels.contains(chars[right])) {
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}
