import java.util.ArrayList;
import java.util.Scanner;

public class CodeVita4{

    // Function to calculate the maximum number of words that can fit into the lines
    public static int getMaxWords(ArrayList<String> words, int N, int M) {
        int count = 0; // Count of words that can fit
        int currentLineLength = 0; // Current line length
        int currentLineCount = 1; // Start with the first line

        for (String word : words) {
            int wordLength = word.length();

            if (wordLength > M) {
                // Skip words longer than the line length
                continue;
            }

            if (currentLineLength + wordLength + (currentLineLength > 0 ? 1 : 0) <= M) {
                // Add word to current line
                currentLineLength += wordLength + (currentLineLength > 0 ? 1 : 0); // Add space between words
                count++;
            } else {
                // Move to the next line
                currentLineCount++;
                if (currentLineCount > N) {
                    break; // Stop if max number of lines is reached
                }
                currentLineLength = wordLength; // Start new line with current word
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of words
        int K = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Read the words
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            words.add(scanner.next());
        }

        // Read the number of lines and the maximum line length
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Compute the maximum number of words that can fit
        int result = getMaxWords(words, N, M);

        // Output the result
        System.out.println(result);

        scanner.close();
    }
}
