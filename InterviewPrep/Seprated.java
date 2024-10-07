package InterviewPrep;

import java.util.Scanner;

public class Seprated {

    // Function to find the length of the largest word separated by periods

    public static int findLargestWordLength(String input) {
        // Split the input string by periods
        
        String[] words = input.split("\\."); 

        // Initialize the maximum length variable
        int maxLength = 0;

        // Iterate through each word to find the largest length
        for (String word : words) {
            // Update the maxLength if the current word's length is greater
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input ="hello.my.nome.is.shaurya"; // Read the input string

        // Find the length of the largest word
        int largestWordLength = findLargestWordLength(input);

        // Print the length of the largest word
        System.out.println(largestWordLength);
        
        scanner.close();
    }
}
