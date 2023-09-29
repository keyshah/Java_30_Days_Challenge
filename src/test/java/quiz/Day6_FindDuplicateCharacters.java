// Day 6 - Find Duplicate Characters in a String in Java

package quiz;

import java.util.HashMap;
import java.util.Map;

public class Day6_FindDuplicateCharacters {

    public static void main(String[] args) {
        String inputString = "My name is Keyur Shah";
        inputString = inputString.replaceAll("\\s+","").toLowerCase();
        Map<Character, Integer> duplicates = findDuplicateCharacters(inputString);

        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : duplicates.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }

    public static Map<Character, Integer> findDuplicateCharacters(String inputString) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }
}
