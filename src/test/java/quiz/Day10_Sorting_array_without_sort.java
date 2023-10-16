package quiz;

import java.util.Arrays;

public class Day10_Sorting_array_without_sort {

    public static void main(String[] args) {
        int[] numbers = {12, 6, 3, 8, 15, 7};
        System.out.println("Original array: " + Arrays.toString(numbers));

        key_min_index_sorting(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    public static void key_min_index_sorting(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted portion of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
    }
}
