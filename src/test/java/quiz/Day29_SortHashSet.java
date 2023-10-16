// Day 29 - Sorting HashSet in Java

package quiz;

import java.util.*;

public class Day29_SortHashSet {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("banana");
        hashSet.add("apple");
        hashSet.add("orange");
        hashSet.add("grape");

        // Convert HashSet to ArrayList for sorting
        List<String> list = new ArrayList<>(hashSet);
        Collections.sort(list); // Sort the list

        // Create a new sorted HashSet from the sorted list
        HashSet<String> sortedHashSet = new HashSet<>(list);

        System.out.println("Original HashSet: " + hashSet);
        System.out.println("Sorted HashSet: " + sortedHashSet);
    }
}
