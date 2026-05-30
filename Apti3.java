import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Apti3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the total number of coins
        int N = Integer.parseInt(bufferedReader.readLine());
        
        // Initialize the TreeMap to store the frequency of coins
        Map<Integer, Integer> coinFrequency = new TreeMap<>();
        
        // Read each coin and update the frequency in the TreeMap
        for (int i = 0; i < N; i++) {
            int coin = Integer.parseInt(bufferedReader.readLine());
            coinFrequency.put(coin, coinFrequency.getOrDefault(coin, 0) + 1);
        }
        
        // Print the frequency of each coin
        for (Map.Entry<Integer, Integer> entry : coinFrequency.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
