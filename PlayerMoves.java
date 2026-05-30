class Solution {
    public int solution(String S) {
        int N = S.length();
        boolean[] field = new boolean[N]; // Represents if a field is occupied
        int successfulMoves = 0;

        for (int i = 0; i < N; i++) {
            char move = S.charAt(i);
            if (move == '<') {
                // Attempt to move left
                if (i > 0 && !field[i - 1]) { // Check if the left field is unoccupied
                    field[i - 1] = true; // Mark the left field as occupied
                    successfulMoves++; // Increment the successful move count
                }
            } else if (move == '>') {
                // Attempt to move right
                if (i < N - 1 && !field[i + 1]) { // Check if the right field is unoccupied
                    field[i + 1] = true; // Mark the right field as occupied
                    successfulMoves++; // Increment the successful move count
                }
            }
            // Moves '^' and 'v' are ignored as they do not affect the field occupation
        }

        return successfulMoves;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        String moves1 = "><><"; // Expected output: 0
        int result1 = sol.solution(moves1);
        System.out.println(result1); // Print result for test case 1

        // Test case 2
        String moves2 = "><^v"; // Expected output: 2
        int result2 = sol.solution(moves2);
        System.out.println(result2); // Print result for test case 2

        // Test case 3
        String moves3 = "<<^<v>>"; // Expected output: 6
        int result3 = sol.solution(moves3);
        System.out.println(result3); // Print result for test case 3
    }
}
