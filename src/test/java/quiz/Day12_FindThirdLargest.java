// Day 12 - Find Third Largest Number in an Array in Java

package quiz;

public class Day12_FindThirdLargest {

    public static void main(String[] args) {
        int[] numbers = {12, 6, 3, 8, 15, 7, 20};
        int thirdLargest = findThirdLargest(numbers);
        System.out.println("The third largest number in the array is: " + thirdLargest);
    }

    public static int findThirdLargest(int[] numbers) {
        if (numbers.length < 3) {
            System.out.println("Array size should be at least 3.");
            return -1;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        // Iterate through the array to find the third largest number
        for (int number : numbers) {
            if (number > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = number;
            } else if (number > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = number;
            } else if (number > thirdLargest) {
                thirdLargest = number;
            }
        }

        return thirdLargest;
    }
}
