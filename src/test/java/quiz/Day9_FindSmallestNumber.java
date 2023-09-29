// Day 9 - Find the Smallest Number in an Array in Java

package quiz;

public class Day9_FindSmallestNumber {

    public static void main(String[] args) {
        int[] numbers = {14, 06, 19, 8, 15, 7};
        int smallestNumber = findSmallestNumber(numbers);
        System.out.println("The smallest number in the array is: " + smallestNumber);
    }

    public static int findSmallestNumber(int[] numbers) {
        // Assume the first number is the smallest
        int smallest = numbers[0];

        // Iterate through the array to find the smallest number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }
}
