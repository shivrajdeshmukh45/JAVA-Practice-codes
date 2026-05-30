import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Apti4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Read the length of the array
        int N = Integer.parseInt(bufferedReader.readLine());

        // Initialize the array
        int[] arr = new int[N];

        // Read the array elements
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        // Read the constant K
        int K = Integer.parseInt(bufferedReader.readLine());
        // 

        // Array to store the result
        int[] result = new int[N];

        // Use a HashSet to track the elements we have seen
        Set<Integer> seen = new HashSet<>();

        // Traverse the array and check for the condition
        for (int i = 0; i < N; i++) {
            // Check if there exists a number in the set such that
            // abs(arr[i] - num) == K
            if (seen.contains(arr[i] + K) || seen.contains(arr[i] - K)) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
            // Add the current element to the set
            seen.add(arr[i]);
        }

        // Print the result
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
