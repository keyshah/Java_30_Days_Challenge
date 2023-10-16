// Day 25 - Find Common Elements Between Two Arrays in Java

package quiz;

import java.util.HashSet;
import java.util.Set;

public class Day25_CommonElements {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 5, 6};
        int[] array2 = {3, 4, 6, 7, 8};

        Set<Integer> commonElements = findCommonElements(array1, array2);
        System.out.println("Common elements between the two arrays: " + commonElements);
    }

    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements from array1 to set1
        for (int num : array1) {
            set1.add(num);
        }

        // Add elements from array2 to set2
        for (int num : array2) {
            set2.add(num);
        }

        // Find common elements by performing an intersection of set1 and set2
        set1.retainAll(set2);

        return set1;
    }
}
