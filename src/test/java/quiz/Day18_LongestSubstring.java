// Day 18 - Find Longest Substring Without Repeating Characters in Java

package quiz;

import java.util.HashMap;

public class Day18_LongestSubstring {

    public static void main(String[] args) {
        String input = "KeyurShah";
        int length = lengthOfLongestSubstring(input);
        System.out.println("Longest substring without repeating characters: " + length);
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int startIndex = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            char currentChar = s.charAt(endIndex);
            if (charIndexMap.containsKey(currentChar)) {
                startIndex = Math.max(startIndex, charIndexMap.get(currentChar) + 1);
            }
            charIndexMap.put(currentChar, endIndex);
            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
        }

        return maxLength;
    }
}
