// Day 4 - Count Occurrences of Each Word in a String in Java

package quiz;

import java.util.HashMap;
import java.util.Map;

public class Day4_CountWordOccurrences {

    public static void main(String[] args) {
        String inputString = "My name is Keyur Shah and this is a Java program. Java is a versatile language, and Java is fun to learn.";
        Map<String, Integer> wordOccurrences = countWordOccurrences(inputString);

        // Display word occurrences
        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Occurrences: " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWordOccurrences(String inputString) {
        String[] words = inputString.split("\\s+"); // Split the string into words
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase to count words regardless of case
            if (wordCountMap.containsKey(word)) {
                // If the word is already in the map, increment its count
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word is not in the map, add it with a count of 1
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }
}
