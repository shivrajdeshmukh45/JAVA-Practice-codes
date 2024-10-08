package Cognizent;

import java.util.ArrayList;
import java.util.List;

public class Collatz {

    public static List<Integer> collatzSequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        while (n != 1) {
            sequence.add(n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        sequence.add(1); // Include the last element, which is 1
        return sequence;
    }

    public static int maxCollatzLength(int n) {
        int maxLength = 0;
        for (int i = 1; i <= n; i++) {
            int length = collatzSequence(i).size();
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }

    public static int maxLengthK(int n) {
        int maxLength = 0;
        int kWithMaxLength = 0;
        for (int i = 1; i <= n; i++) {
            int length = collatzSequence(i).size();
            if (length > maxLength) {
                maxLength = length;
                kWithMaxLength = i;
            }
        }
        return kWithMaxLength;
    }

    public static int maxValueInCollatz(int n) {
        int maxValue = 0;
        for (int i = 1; i <= n; i++) {
            List<Integer> sequence = collatzSequence(i);
            for (int value : sequence) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }
        }
        return maxValue;
    }

    public static int kWithMaxValue(int n) {
        int maxValue = 0;
        int kWithMaxValue = 0;
        for (int i = 1; i <= n; i++) {
            List<Integer> sequence = collatzSequence(i);
            int maxValueInSequence = sequence.stream().max(Integer::compare).orElse(0);
            if (maxValueInSequence > maxValue) {
                maxValue = maxValueInSequence;
                kWithMaxValue = i;
            }
        }
        return kWithMaxValue;
    }

    public static void main(String[] args) {
        int n = 10; // You can change this value for different inputs
        System.out.println("Collatz sequence for n = " + n + ": " + collatzSequence(n));
        System.out.println("Maximum length of Collatz sequence for 1 <= k <= n: " + maxCollatzLength(n));
        System.out.println("k with maximum length Collatz sequence: " + maxLengthK(n));
        System.out.println("Maximum value in any Collatz sequence for 1 <= k <= n: " + maxValueInCollatz(n));
        System.out.println("k with maximum value in its Collatz sequence: " + kWithMaxValue(n));
    }
}