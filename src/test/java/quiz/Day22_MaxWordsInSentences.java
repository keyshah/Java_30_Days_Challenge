// Day 22 - Find Maximum Number of Words in Sentences in Java

package quiz;

public class Day22_MaxWordsInSentences {

    public static void main(String[] args) {
        String[] sentences = {
                "This is a sentence.",
                "Hello, world!",
                "Java programming is fun."
        };

        int maxWords = findMaxWords(sentences);
        System.out.println("Maximum number of words in sentences: " + maxWords);
    }

    public static int findMaxWords(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+"); // Split sentence into words
            maxWords = Math.max(maxWords, words.length); // Update maxWords if current sentence has more words
        }
        return maxWords;
    }
}
