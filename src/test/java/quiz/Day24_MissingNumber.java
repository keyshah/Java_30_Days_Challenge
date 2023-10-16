// Day 24 - Find Missing Number in Array of Consecutive Numbers in Java

package quiz;

public class Day24_MissingNumber {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 6, 7, 8};
        int missingNumber = findMissingNumber(numbers);
        System.out.println("Missing number in the array: " + missingNumber);
    }

    public static int findMissingNumber(int[] numbers) {
        int n = numbers.length + 1;
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers

        int arraySum = 0;
        for (int number : numbers) {
            arraySum += number;
        }

        return totalSum - arraySum;
    }
}
