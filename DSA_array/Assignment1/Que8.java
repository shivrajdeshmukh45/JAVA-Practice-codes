// 8] Even occurring elements
// Given an array Arr of N integers that contains an odd number of occurrences for all
// numbers except for a few elements which are present even number of times. Find
// the elements which have even occurrences in the array.
// Example 1:
// Input:
// N = 11
// Arr[] = {9, 12, 23, 10, 12, 12,
// 15, 23, 14, 12, 15}
// Output: 12 15 23

package DSA_array.Assignment1;

public class Que8 {
    public static void main(String[] args) {
        int Arr[] = {9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15};
        int n = Arr.length;
        
        int newArr[] = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (Arr[i] == Arr[j]) {
                    count++;
                }
            }
            if (count % 2 == 0 && !isInArray(newArr, Arr[i], index)) {
                newArr[index++] = Arr[i];
            }
        }

        System.out.print("Elements with even occurrences: ");
        for (int i = 0; i < index; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    // Helper method to check if an element is already in the array
    
    private static boolean isInArray(int[] array, int element, int size) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}
