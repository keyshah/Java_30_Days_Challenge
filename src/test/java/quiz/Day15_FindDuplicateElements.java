// Day 15 - Find Duplicate Elements in an Array in Java

package quiz;

import java.util.HashSet;
import java.util.Set;

public class Day15_FindDuplicateElements {

    public static void main(String[] args) {
        int[] numbers = {4, 2, 6, 8, 2, 9, 4, 3};
        System.out.println("Duplicate elements in the array:");
        findDuplicateElements(numbers);
    }

    public static void findDuplicateElements(int[] numbers) {
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (int number : numbers) {
            if (!uniqueElements.add(number)) {
                duplicateElements.add(number);
            }
        }

        for (int duplicate : duplicateElements) {
            System.out.println(duplicate);
        }
    }
}
