// 9] Remove an Element at Specific Index from an Array
// Given an array of a fixed length. The task is to remove an element at a specific
// index from the array.
// Examples 1:
// Input: arr[] = { 1, 2, 3, 4, 5 }, index = 2
// Output: arr[] = { 1, 2, 4, 5 }
// Examples 2:
// Input: arr[] = { 4, 5, 9, 8, 1 }, index = 3
// Output: arr[] = { 4, 5, 9, 1 }



package DSA_array.Assignment1;

public class Que9 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n=arr.length;

        int index = 2;
        int newArr[]=new int[arr.length-1];


        for(int i=0, j=0;i<n;i++){
            if(i!=index){
                
           
            newArr[j++]=arr[i];
            }
        }
       //newArr[newArr.length-1]=arr[n-1];
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }

    }


    
}
