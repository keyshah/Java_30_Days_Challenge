// Day 13 - Find Factorial of a Number in Java

package quiz;

public class Day13_Factorial {

    public static void main(String[] args) {
        int number = 6; // Change this number to calculate factorial for a different number
        long factorial = findFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static long findFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1; // Factorial of 0 and 1 is 1
        } else {
            long factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i; // Multiply factorial with current number
            }
            return factorial;
        }
    }
}
