// Day 7 - Find Duplicate Words in a Given String in Java

package quiz;

import java.util.HashMap;
import java.util.Map;

public class Day7_FindDuplicateWords {

    public static void main(String[] args) {
        String inputString = "My name is Keyur Shah & Shah is my surname and Keyur is my name";
        Map<String, Integer> duplicateWords = findDuplicateWords(inputString);

        System.out.println("Duplicate words in the string:");
        for (Map.Entry<String, Integer> entry : duplicateWords.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }

    public static Map<String, Integer> findDuplicateWords(String inputString) {
        String[] words = inputString.split("\\s+"); // Split the string into words
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase(); // Remove non-alphabetical characters and convert to lowercase
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}
