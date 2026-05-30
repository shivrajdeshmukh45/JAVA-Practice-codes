
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr= {4,5,3,73,7,9,4,2,8};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }

     public static void quickSort(int arr[],int low,int hi){

        if (low>=hi) {
            return;
            
        }

        int s=low;
        int e=hi;

        //selected  middle element is as Pivot
        int m=s+(e-s)/2;
        int pivot=arr[m];

        while (s<=e) {
            while (arr[s]<pivot) {
                s++;
                
            }

            while (arr[e]>pivot) {
                e--;
                
            }

            if (s<=e) {
                
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;

                s++;
                e--;
            }
            
        }

        //now my pivot is as at correct index please two halves now
        quickSort(arr, low,e);
        quickSort(arr, s, hi);


     }
    
}
