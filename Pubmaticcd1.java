
// The Caesar Cipher involves shifting all characters in a string by a number to produce a new string.
// For instance, with a shift of 1 right, the string 'abcz becomes 'bcda'. Note that the rotation is circular, so z\rightarrow1=a This challenge involves a modification in that substrings within the string are shifted instead of the whole string.

// Consider a string s, composed of English lowercase letters ascii[a-z]. There are two kinds of operations you can perform on s

// 1. Roll Forward (right): i j R.

// Every character in the substring s[i], s[i+1]..... s[j-1], s[j] will roll forward and be replaced with its next sequential alphabetical character (the next character after z is a). For example: a\rightarrow b m\rightarrow n.

// z\rightarrow a

// 2. Roll Backward (left): i j L Every character in the substring s[i], s[i+1],...,s[j-1], s[j] will roll backward and be replaced with its preceding alphabetical character (the character preceding a is z). For example: y\leftarrow z m\leftarrow n . z\leftarrow a.

// For example, given the string s=^{\prime}abc^{\prime} and the following list of sequential operations:

import java.io.*;
import java.util.*; 
import java.util.stream.*;

class Result {

    /*
     * Complete the 'rollingString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts the following parameters:
     * 1. STRING s
     * 2. STRING ARRAY operations
     */
    
    // Function to roll forward (Right) on a single character
    public static char rollForward(char c) {
        if (c == 'z') {
            return 'a';
        }
        return (char) (c + 1);
    }

    // Function to roll backward (Left) on a single character
    public static char rollBackward(char c) {
        if (c == 'a') {
            return 'z';
        }
        return (char) (c - 1);
    }

    public static String rollingString(String s, List<String> operations) {
        char[] strArray = s.toCharArray();  // Convert the string to a character array

        for (String operation : operations) {
            // Parse the operation string to get start index, end index, and direction
            String[] parts = operation.split(" ");
            int i = Integer.parseInt(parts[0]);  // Start index
            int j = Integer.parseInt(parts[1]);  // End index
            char direction = parts[2].charAt(0);  // Direction (L or R)

            // Apply the operation to the substring from index i to j
            if (direction == 'R') {
                for (int k = i; k <= j; k++) {
                    strArray[k] = rollForward(strArray[k]);
                }
            } else if (direction == 'L') {
                for (int k = i; k <= j; k++) {
                    strArray[k] = rollBackward(strArray[k]);
                }
            }
        }

        return new String(strArray);  // 
    }
}

public class Pubmaticcd1{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // Read the input string
        String s = bufferedReader.readLine();

        // Read the number of operations
        int operationsCount = Integer.parseInt(bufferedReader.readLine().trim());

        // Read the operations into a list
        List<String> operations = IntStream.range(0, operationsCount)
                .mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(Collectors.toList());

        // Get the result after performing all operations
        String result = Result.rollingString(s, operations);

        // Write the result to the output
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        // Close readers and writers
        bufferedReader.close();
        bufferedWriter.close();
    }
}
