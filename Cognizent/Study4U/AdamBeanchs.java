package Cognizent.Study4U;

import java.util.Arrays;

public class AdamBeanchs{

    public static int minLampPower(int numBenches, int numLamps, int[] benches, int[] lamps) {
        // Step 1: Sort benches and lamps
        Arrays.sort(benches);
        Arrays.sort(lamps);
        
        // Step 2: Binary search on power
        int low = 0;
        int high = Math.max(benches[numBenches - 1], lamps[numLamps - 1]) - Math.min(benches[0], lamps[0]);
        int result = high;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canCoverAllBenches(mid, benches, lamps)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return result;
    }

    private static boolean canCoverAllBenches(int power, int[] benches, int[] lamps) {
        int i = 0; // index for benches
        for (int lamp : lamps) {
            int start = lamp - power;
            int end = lamp + power;
            
            // Cover all benches within the current lamp's illumination range
            while (i < benches.length && benches[i] >= start && benches[i] <= end) {
                i++;
            }
            
            // If all benches are covered, return true
            if (i == benches.length) {
                return true;
            }
        }
        
        // Check if all benches were covered
        return i == benches.length;
    }

    public static void main(String[] args) {
        int numBenches = 6;
        int numLamps = 4;
        int[] benches = {2, 7, 12, 17,22,27};
        int[] lamps = {5, 10,15,20};

        int result = minLampPower(numBenches, numLamps, benches, lamps);
        System.out.println("Minimum lamp power required: " + result);  // Expected output: 1
    }
}
