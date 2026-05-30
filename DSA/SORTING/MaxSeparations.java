import java.util.*;

public class MaxSeparations {
    public static int findMaxSeparations(int N, int K, int[] arr) {
        List<Integer> costs = new ArrayList<>();
        int oddCount = 0, evenCount = 0;

        // Count odd and even numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // If odd and even numbers are not equal, no valid partitions can be made
        if (oddCount != evenCount) {
            return 0;
        }

        int currentOdd = 0, currentEven = 0;

        // Compute the cost of valid separations
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] % 2 == 0) {
                currentEven++;
            } else {
                currentOdd++;
            }

            // A valid separation must have equal odd and even counts in both partitions
            if (currentOdd == currentEven) {
                costs.add(Math.abs(arr[i] - arr[i + 1]));
            }
        }

        // Sort costs in ascending order (to use minimal coins)
        Collections.sort(costs);

        int separations = 0;
        int usedCoins = 0;

        // Count the maximum number of separations within the budget K
        for (int cost : costs) {
            if (usedCoins + cost <= K) {
                usedCoins += cost;
                separations++;
            } else {
                break;
            }
        }

        return separations;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Compute and print the maximum number of separations
        System.out.println(findMaxSeparations(N, K, arr));
    }
}

