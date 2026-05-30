// Long Encoded String
// Consider 
// a string that consists of lowercase English letters (i.e., [a-z)) only. 
//The following rules are used to encode all of its characters into the string s.
//ALL a is encoded as 1, b is encoded as 2, c is encoded as 3,..., and i is encoded as 9.j is encoded as 10#, k is encoded as 11#, /is encoded as 12#,..., and z is encoded as 26#. 
//If any character occurs two or more consecutively, its count immediately follows the encoded character in parentheses, e.g. 'aa' is encoded as '1(2)'.
//Examples• String "abzx" is encoded as s = "1226#24#".
//• String "aabccc" is encoded as s = "1(2)23(3)".• String "bajj" is encoded as s = "2110#(2)".• String "wwxyzwww"is encoded as s = "23# (2)24#25#26#23#(3)".Given an encoded string s, determine the character counts for each letter of the original, decoded string. Return array of 26 integers where index O contains the number of 'a' characters, index 1 contains the number of 'b' characters, and so on. Function DescriptionComplete the frequency function in the editor below.frequency has the following parameter:string s: an encoded stringALLReturnint[26]: the character frequencies as described5689Constraints• String s consists of decimal integers from 0 to 9, #s, and ('s only.• 1≤length of s≤ 105• It is guaranteed that string sis a valid encoded string.• 25C5104, where c is a parenthetical count of consecutive occurrences of an eroded character.► Input Format For Custom Testing
// Sample Input For Custom Testing1226#24#

// Output
// 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1





import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

final class Result {

    public static List<Integer> frequency(String s) {
        // Initialize an array of size 26 to store frequencies of 'a' to 'z'
        int[] freq = new int[26];
        int i = 0;

        while (i < s.length()) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                // Handling two-digit encoded characters (like 10# for 'j', 26# for 'z')
                int num = Integer.parseInt(s.substring(i, i + 2)) - 1; // Convert to 0-based index
                i += 3; // Skip over the 'num#'

                // Check if there's a count in parentheses
                if (i < s.length() && s.charAt(i) == '(') {
                    int j = i + 1;
                    int count = 0;
                    while (s.charAt(j) != ')') {
                        count = count * 10 + (s.charAt(j) - '0'); // Parsing the count
                        j++;
                    }
                    freq[num] += count;
                    i = j + 1; // Skip past the closing parenthesis ')'
                } else {
                    freq[num]++; // If no parentheses, it's just one occurrence
                }
            } else if (Character.isDigit(s.charAt(i))) {
                // Handling single-digit encoded characters (like 1 for 'a', 9 for 'i')
                int num = s.charAt(i) - '1'; // Convert to 0-based index
                i++; // Move past the digit

                // Check if there's a count in parentheses
                if (i < s.length() && s.charAt(i) == '(') {
                    int j = i + 1;
                    int count = 0;
                    while (s.charAt(j) != ')') {
                        count = count * 10 + (s.charAt(j) - '0'); // Parsing the count
                        j++;
                    }
                    freq[num] += count;
                    i = j + 1; // Skip past the closing parenthesis ')'
                } else {
                    freq[num]++; // If no parentheses, it's just one occurrence
                }
            }
        }

        // Convert the frequency array to a List<Integer> to match the return type
        return Arrays.stream(freq).boxed().collect(Collectors.toList());
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // Read the encoded string from input
        String s = bufferedReader.readLine();

        // Call the frequency function to decode the string and get the frequency of letters
        List<Integer> result = Result.frequency(s);

        // Print the result as space-separated integers
        for (int i = 0; i < result.size(); i++) {
            if (i > 0) {
                bufferedWriter.write(" ");
            }
            bufferedWriter.write(result.get(i).toString());
        }
        bufferedWriter.newLine();

        // Close the buffered readers and writers
        bufferedReader.close();
        bufferedWriter.close();
    }
}
