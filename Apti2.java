import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Apti2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        
        int result = firstUniqChar(s);
        
        System.out.print(result);
        
        bufferedReader.close();
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int n = s.length();
        
        // Populate the hashmap with character frequencies
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // Find the first unique character
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1; // If no unique character found
    }
}
