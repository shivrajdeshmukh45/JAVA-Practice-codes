package Cognizent;

public class SubArraySum {

    public static int countSubarrays(int[] arr, int X) {
        int n = arr.length;
        int count = 0;

        // // Iterate over all possible subarray start indices
        // for (int start = 0; start < n; start++) {
        //     // Iterate over all possible subarray end indices
        //     for (int end = start; end < n; end++) {
        //         // If the sum of the first and last element of the subarray is <= X
        //         if (arr[start] + arr[end] <= X) {
        //             count++;
        //         }
        //     }
        // }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]+arr[j]<=X){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,16};  // sorted array
        int X = 6;
        int result = countSubarrays(arr, X);
        System.out.println(result);  // Output: 2
    }
}
