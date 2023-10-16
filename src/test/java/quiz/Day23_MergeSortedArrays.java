// Day 23 - Merge Two Sorted Arrays in Java

package quiz;

import java.util.Arrays;

public class Day23_MergeSortedArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};

        int[] mergedArray = mergeSortedArrays(array1, array2);
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from both arrays
        while (i < array1.length) {
            mergedArray[k] = array1[i];
            i++;
            k++;
        }

        while (j < array2.length) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
