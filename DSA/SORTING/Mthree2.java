import java.util.*;

public class Mthree2 {
    public static void solution(int N, int C, int[] plants) {
        int steps = 0;
        int water = C;

        for (int i = 0; i < N; i++) {
            if (water < plants[i]) {
                // Return to water source and refill
                steps += 2 * i;
                water = C;
            }

            // Water the plant
            water -= plants[i];
            steps++;
        }

        System.out.println(steps);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Number of plants
        int C = sc.nextInt(); // Capacity of the watering can
        int[] plants = new int[N];
        for (int i = 0; i < N; i++) {
            plants[i] = sc.nextInt(); // Water requirements of the plants
        }

        solution(N, C, plants);
    }
}