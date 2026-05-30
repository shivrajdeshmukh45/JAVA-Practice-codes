import java.util.*;

public class CodeVita3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int K = sc.nextInt();

        // To store columns where block K appears
        Set<Integer> targetColumns = new HashSet<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] == K) {
                    targetColumns.add(j);
                }
            }
        }
        Set<Integer> blocksToRemove = new HashSet<>();
        for (int j : targetColumns) {
            for (int i = 0; i < N; i++) {
                if (matrix[i][j] == K) {
                    break; // Stop once we reach block K
                }
                blocksToRemove.add(matrix[i][j]);
            }
        }
        System.out.println(blocksToRemove.size());
}
}