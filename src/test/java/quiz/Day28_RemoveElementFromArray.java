// Day 28 - Remove Specific Element from Array and Shift Remaining Elements in Java

package quiz;

import java.util.Arrays;

public class Day28_RemoveElementFromArray {

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 2, 5, 8};
        int elementToRemove = 5;
        int[] resultArray = removeElement(array, elementToRemove);
        System.out.println("Array after removing element " + elementToRemove + ": " + Arrays.toString(resultArray));
    }

    public static int[] removeElement(int[] array, int element) {
        int count = 0;

        // Count occurrences of the element to remove
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                count++;
            }
        }

        // Create a new array with adjusted size
        int[] resultArray = new int[array.length - count];
        int index = 0;

        // Copy elements excluding the specified element
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) {
                resultArray[index] = array[i];
                index++;
            }
        }

        return resultArray;
    }
}
