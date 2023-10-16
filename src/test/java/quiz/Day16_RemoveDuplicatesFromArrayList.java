// Day 16 - Remove Duplicates from ArrayList in Java

package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Day16_RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("apple");
        listWithDuplicates.add("orange");
        listWithDuplicates.add("banana");
        listWithDuplicates.add("apple");
        listWithDuplicates.add("grape");
        listWithDuplicates.add("orange");

        System.out.println("List with duplicates: " + listWithDuplicates);

        List<String> listWithoutDuplicates = removeDuplicates(listWithDuplicates);
        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }

    public static List<String> removeDuplicates(List<String> listWithDuplicates) {
        // Create a HashSet to store unique elements
        HashSet<String> uniqueElements = new HashSet<>(listWithDuplicates);

        // Clear the original list and add unique elements back to it
        listWithDuplicates.clear();
        listWithDuplicates.addAll(uniqueElements);

        return listWithDuplicates;
    }
}
