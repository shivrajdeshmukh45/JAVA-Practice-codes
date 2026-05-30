package InterviewPrep;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPair {

    public static int[] solve(int n, int[] arr, int target) {
        int[] ans = new int[2];
        int prod = 0;

        // Convert int array to Integer array and sort
        Integer[] arrWrapper = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arrWrapper);

        int st = 0, end = n - 1;

        while (st < end) {
            int sum = arrWrapper[st] + arrWrapper[end];

            if (sum == target) {
                if (prod < arrWrapper[st] * arrWrapper[end]) {
                    prod = arrWrapper[st] * arrWrapper[end];
                    ans[0] = arrWrapper[st];
                    ans[1] = arrWrapper[end];
                }
                st++;
                end--;
            } else if (sum < target) {
                st++;
            } else {
                end--;
            }
        }

        // Output the result
        System.out.println(ans[0] + " " + ans[1]);
        return ans;
    }

    public static void main(String[] args) {
        int n = 8; // Size of the array
        int[] arr = {11, 1, 2, 8, 10, 11, 15, 7};
        int target = 18; // Target value

        solve(n, arr, target);
    }
}
