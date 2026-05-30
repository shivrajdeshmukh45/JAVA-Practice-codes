
import java.util.*;

public class Mthree {
    public static void solve(int N, int M, int[] requests) {
        int[] servers = new int[N]; // Array to track workloads of servers
        List<Integer> result = new ArrayList<>(); // To store server assignments

        for (int request : requests) {
            int minServer = 0;
            for (int i = 1; i < N; i++) {
                if (servers[i] < servers[minServer]) {
                    minServer = i;
                }
            }
            
            servers[minServer] += request; // Assign request to the chosen server
            result.add(minServer + 1); // Store 1-based index
        }
        
        result.forEach(server -> System.out.print(server + " "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] requests = new int[M];
        for (int i = 0; i < M; i++) {
            requests[i] = scanner.nextInt();
        }
        scanner.close();
        
        solve(N, M, requests);
        

    }
}
