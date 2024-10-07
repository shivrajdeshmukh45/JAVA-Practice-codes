package InterviewPrep;

public class PalindromeNo {
    public static void main(String[] args) {
        int num = 141;
        int temp = num;
        int rem = 0;
        int reverse = 0;

        // Reverse the number
        while (temp != 0) {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }

        // Check if the reversed number is equal to the original number
        if (reverse == num) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
