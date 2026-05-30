package Arrays.Array6;

public class Que9 {

    public static void main(String[] args) {
        int arr[] = new int[]{121, 1, 58, 333, 616, 9};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i])) {
                count++;
            }
        }

        System.out.println("Count of palindrome elements is: " + count);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
