package CyclicSort;

import java.util.Arrays;

public class FindMissingEle {

    static int sort(int arr[]){ //5,3,2,0,1
                                //0,1,2,3,4

        int i=0;
        while (i<arr.length) {
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swapped(arr,i,correct);  
            }else{
                i++;
            }
            
        }
        //return the missing value in array

        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index) {
                return index;
                
            }
            
        }
        return arr.length;
    }
    static void swapped(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args) {
        
        int arr[]={5,3,2,0,1};
        int val=sort(arr);
        System.out.println(val);
        System.out.println(Arrays.toString(arr));
    }
    
}




// class Solution {
//     static public int missingNumber(int[] nums) {
 
//          int i=0;
 
//          while(i<nums.length){
//              int correct =nums[i];
//              if(nums[i]<nums.length && nums[i]!=nums[correct]){
//                  swapped(nums,i,correct);
//              }else{
//                  i++;
//              }
//          }
 
 
//          for(int index=0;index<nums.length;index++){
//              if(nums[index]!=index){
//                  return index;
//              }
//          }
//          return nums.length;
         
//      }
//      static  void swapped(int arr[],int start,int second){
//          int temp=arr[start];
//          arr[start]=arr[second];
//          arr[second]=temp;
 
//      }
//  }