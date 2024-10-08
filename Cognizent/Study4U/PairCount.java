package Cognizent.Study4U;

public class PairCount {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8};
        int val = 5;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum < val && arr[i]<=arr[j]) {
                    count++;
                    System.out.println("count: " + count + " | Pair: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }

        System.out.println("Total count: " + count);
    }
}
