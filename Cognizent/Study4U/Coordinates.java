package Cognizent.Study4U;

import java.util.Arrays;

public class Coordinates {
    public static int maxCoordinateReached(int N, int K, int[] A, int[] B) {
        // Create an array of checkpoints with coordinates and rewards
        int[][] checkpoints = new int[N][2];
        for (int i = 0; i < N; i++) {
            checkpoints[i][0] = A[i];
            checkpoints[i][1] = B[i];
        }

        // Sort checkpoints by coordinates
        Arrays.sort(checkpoints, (a, b) -> Integer.compare(a[0], b[0]));

        int currentPosition = 0;
        int coins = K;

        for (int i = 0; i < N; i++) {
            int checkpoint = checkpoints[i][0];
            int reward = checkpoints[i][1];

            int distanceToCheckpoint = checkpoint - currentPosition;
            if (coins < distanceToCheckpoint) {
                // Can't reach this checkpoint
                return currentPosition + coins;
            }

            // Reach the checkpoint
            coins -= distanceToCheckpoint;
            currentPosition = checkpoint;

            // Collect reward
            coins += reward;
        }

        // Move as far as possible with the remaining coins after all checkpoints
        return currentPosition + coins;
    }

    public static void main(String[] args) {
        // Example input
        int N = 2;
        int K = 3;
        int[] A = {2, 5};
        int[] B = {1,10};

        // Calling the function
        System.out.println("Maximum coordinate reached: " + maxCoordinateReached(N, K,A,B));
}
}