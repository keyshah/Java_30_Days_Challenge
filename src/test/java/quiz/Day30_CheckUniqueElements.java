// Day 30 - Check if All Elements in a List are Unique in Java

package quiz;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day30_CheckUniqueElements {

    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5);
        List<Integer> numbers2 = List.of(1, 2, 3, 2, 4, 5);

        boolean areAllUnique1 = areAllElementsUnique(numbers1);
        boolean areAllUnique2 = areAllElementsUnique(numbers2);

        System.out.println("Are all elements in numbers1 unique? " + areAllUnique1);
        System.out.println("Are all elements in numbers2 unique? " + areAllUnique2);
    }

    public static <T> boolean areAllElementsUnique(List<T> list) {
        Set<T> uniqueElements = new HashSet<>();

        for (T element : list) {
            if (!uniqueElements.add(element)) {
                // If element already exists in the set, it's not unique
                return false;
            }
        }

        // All elements are unique
        return true;
    }
}
