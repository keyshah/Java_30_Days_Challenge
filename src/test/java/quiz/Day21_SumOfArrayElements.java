// Day 21 - Find Sum of Elements in an Array in Java

package quiz;

public class Day21_SumOfArrayElements {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = findSum(numbers);
        System.out.println("Sum of elements in the array: " + sum);
    }

    public static int findSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
