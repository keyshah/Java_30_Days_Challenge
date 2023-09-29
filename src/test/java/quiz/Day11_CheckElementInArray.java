// Day 11 - Check if an Element is Present in an Array in Java

package quiz;

public class Day11_CheckElementInArray {

    public static void main(String[] args) {
        int[] numbers = {12, 6, 3, 8, 15, 7};
        int target = 8;

        if (isElementPresent(numbers, target)) {
            System.out.println("Element " + target + " is present in the array.");
        } else {
            System.out.println("Element " + target + " is not present in the array.");
        }
    }

    public static boolean isElementPresent(int[] numbers, int target) {
        // Iterate through the array to find the element
        for (int number : numbers) {
            if (number == target) {
                return true; // Element found, return true
            }
        }
        return false; // Element not found, return false
    }
}
