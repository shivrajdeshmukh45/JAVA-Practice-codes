package InsertionSort;

import java.util.Arrays;

public class Pr1 {

    static void insertionSort(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {     //        for (int i = 0; i <= arr.length-2; i++) 
            for (int j = i+1; j>0; j--) {
                if (arr[j]<arr[j-1]) {
                    swapped(arr,j,j-1);
                    
                }else{
                    break;
                }
                
            }
            
        }
    }

    static void swapped(int arr[],int start,int second){

        int temp=arr[start];
        arr[start]=arr[second];
        arr[second]=temp;
    }

public static void main(String[] args) {
    int arr[]={5,3,1,23,6};
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));

}

}