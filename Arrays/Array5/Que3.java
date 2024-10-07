package Arrays.Array5;

import java.util.Scanner;

public class Que3 {
    // Function to check if an array is a palindrome
    public static boolean isPalindrome(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the elements of the array
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check if the array is a palindrome
        if (isPalindrome(arr)) {
            System.out.println("The given array is a palindrome array.");
        } else {
            System.out.println("The given array is not a palindrome array.");
        }

        scanner.close();
    }
}
