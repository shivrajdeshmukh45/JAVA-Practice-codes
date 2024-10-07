package DSA_array.Lec_1;
// second largest number in array
public class Code4 {

    public static void main(String[] args) {
        
        int maxNum = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int arr[] = new int[]{8, 4, 1, 3, 9, 2, 6, 7};

        // Find the maximum number in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }

        // Find the second maximum number in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secMax && arr[i] < maxNum) {
                secMax = arr[i];
            }
        }

        System.out.println("Second max: " + secMax);
    }
}

