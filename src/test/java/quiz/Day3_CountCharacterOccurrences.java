// Day 3 - Count the Occurrences of Each Character in Java

package quiz;

import java.util.HashMap;
import java.util.Map;

public class Day3_CountCharacterOccurrences {

    public static void main(String[] args) {
        String inputString = "My name is Keyur Shah and I love finding bugs";
        countCharacterOccurrences(inputString);
    }

    public static void countCharacterOccurrences(String inputString) {
        // Remove spaces and convert to lowercase to count characters regardless of case and spaces.
         inputString = inputString.replaceAll("\\s+", "").toLowerCase();

        // Create a HashMap to store character counts.
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the input string to a character array.
        char[] charArray = inputString.toCharArray();

        // Iterate through the character array.
        for (char c : charArray) {
            if (charCountMap.containsKey(c)) {
                // If the character is already in the map, increment its count.
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If the character is not in the map, add it with a count of 1.
                charCountMap.put(c, 1);
            }
        }

        // Display the character counts.
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
