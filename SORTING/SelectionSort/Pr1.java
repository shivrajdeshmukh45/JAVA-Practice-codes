package SelectionSort;

import java.util.Arrays;

public class Pr1 {

    static void selcetion(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr, 0,last);
            swapped(arr,maxIndex,last);
            
        }
    }

    static void swapped(int arr[],int start,int second){

        int temp=arr[start];
        arr[start]=arr[second];
        arr[second]=temp;
    }



    static int getMaxIndex(int arr[],int start,int last){
          int max=start;

        for (int i = start; i < last; i++) {
        

            if (arr[max]<arr[i]) {
                max=i;
                
            }
            
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]= {4,5,3,1,6,9,7};
        selcetion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
    
}
