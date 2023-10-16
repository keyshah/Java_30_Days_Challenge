// Day 26 - Count Frequency of Elements in an Array in Java

package quiz;

import java.util.HashMap;
import java.util.Map;

public class Day26_FrequencyCount {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 5, 2, 6, 3};
        Map<Integer, Integer> frequencyMap = countFrequency(array);
        System.out.println("Frequency of elements in the array: " + frequencyMap);
    }

    public static Map<Integer, Integer> countFrequency(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of elements
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return frequencyMap;
    }
}
