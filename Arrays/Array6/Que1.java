// Q1. Write a program to check whether the given array is descending or not.
// Input 1:
// Enter the size of the array:
// 4
// Enter the elements of the array:
// 15
// 9
// 5
// 1
// Output :
// Given array is in descending order.

package Arrays.Array6;

public class Que1 {
    public static void main(String[] args) {
        boolean isDesend=true;


        int arr[]=new int[]{15,9,5,1};
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                isDesend=false;
                break;                                                                                                                 
            }
           
        }
        if(isDesend==true){
            System.out.println("Given array is in descending order.");
        }else{
            System.out.println("Given array is NOT  in descending order.");
        }
    }
    
}
