import java.io.*;
import java.util.*;

class UserMainCode {

    public int greatestPrimeIndex(int input1, int[] input2) {
        if (input1 <= 1) {
            return -1;
        }

        int maxTreasure = -1;

        for (int i = 2; i <= input1; i++) {
            if (isPrime(i)) {
                if (i <= input2.length) {
                    maxTreasure = Math.max(maxTreasure, input2[i - 1]);
                }
            }
        }

        return maxTreasure;
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        UserMainCode solution = new UserMainCode();

        // Example 1
        int input1_1 = 5;
        int[] input2_1 = {12, 9, 10, 15, 5};
        int result1 = solution.greatestPrimeIndex(input1_1, input2_1);
        System.out.println("Result 1: " + result1); // Output: 10

        // Example 2
        int input1_2 = 1;
        int[] input2_2 = {4};
        int result2 = solution.greatestPrimeIndex(input1_2, input2_2);
        System.out.println("Result 2: " + result2); // Output: -1

     
    }
}