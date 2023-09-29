// Day 10 - Sort an Array in Java

package quiz;

import java.util.Arrays;

public class Day10_SortArray {

    public static void main(String[] args) {
        int[] numbers = {12, 6, 3, 8, 15, 7};
        System.out.println("Original array: " + Arrays.toString(numbers));

        sortArray(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    public static void sortArray(int[] numbers) {
        Arrays.sort(numbers);
    }
}
