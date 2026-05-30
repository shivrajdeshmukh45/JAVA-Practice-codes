


import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int arr[]={3,5,9,19,32,4,6,8};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));//
        
    }

    public static int[] mergeSort(int arr[]){

//       when the base case occurs  the array  start returning
        if (arr.length==1) {
            return arr;
            
        }
        
        int mid=arr.length/2;

        //this statement divides the array in two parts continiously

        int[] left=Arrays.copyOfRange(arr, 0, mid);
        int[] right=Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left),mergeSort(right));
        //recursive calls fal, the partionaing the array //for each separate call
    }

    
    public static int[] merge(int [] first,int[] second){
        int [] mix=new int[first.length +second.length];

        int i=0;
        int j=0;
        int k=0;

        while (i<first.length && j<second.length) {
            if (first[i]<second[j]) {
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;

            
        }

        //it may possible that one of array is not complete
        //following loop dirctly add the remaining element
        //either of i array or j array


        //this is for first part of array
        while (i<first.length) {
            mix[k]=first[i];
           
            k++;
            i++;
            
            
        }
        //this is for second part of array
        while (j<second.length) {
            mix[k]=second[j];
        
            k++;
            j++;
            
        }
        return mix;

    }
}