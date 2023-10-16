// Day 17 - Sorting Words in a Sentence in Java

package quiz;

import java.util.Arrays;

public class Day17_SortSentence {

    public static void main(String[] args) {
        String sentence = "This is an example sentence to sort words.";
        String sortedSentence = sortWordsInSentence(sentence);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Sorted Sentence: " + sortedSentence);
    }

    public static String sortWordsInSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Sort the words
        Arrays.sort(words);

        // Join the sorted words back into a sentence
        StringBuilder sortedSentence = new StringBuilder();
        for (String word : words) {
            sortedSentence.append(word).append(" ");
        }

        return sortedSentence.toString().trim();
    }
}
