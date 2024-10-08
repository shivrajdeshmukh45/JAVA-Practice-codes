// 4. Median of Two Sorted Arrays
// Hard
// Topics
// Companies
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

 

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 


package Cognizent;

import java.util.Arrays;

public class ArrayMedian {
      public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int l1 = nums1.length;
        int l2 = nums2.length;
        int j = 0;

        // Create a new array to store both nums1 and nums2
        int[] arr = new int[l1 + l2];

        // Copy nums1 into arr
        for (int i = 0; i < l1; i++) {
            arr[j] = nums1[i];
            j++;
        }

        // Copy nums2 into arr
        for (int i = 0; i < l2; i++) {
            arr[j++] = nums2[i];
        }

        // Sort the combined array
        Arrays.sort(arr);
        int n=arr.length;

       if(n%2==1){
            return arr[n/2];
       }else{

            return (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
       }
    }
    public static void main(String[] args) {
       ArrayMedian ar = new ArrayMedian();

        int[] nums1 = {1, 2}; 
        int[] nums2 = {3, 4};

        findMedianSortedArrays(nums1,nums2);
    
}
}
