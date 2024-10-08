
// Noah is given an integer array A of length N. 
// He must perform the following operations on the arraySelect any integer pair/s from the array with their sum equal to 18.
// From this select the pair with the maximum product such that the first element of the pair is greater than the second element of the pair.

// Input Specification:input1:
//  An integer value N. representing the size of array A
//   input2: An integer array 
// Specification:Return a pair in the form of an integer array which satisfies the conditions mentioned.

// Example 1:
// input1:8
// input2: (11,1,2,8,10.11.15.7)
// Output: (10,8)
package Cognizent;
public class PairArray {



    static int [] findPair(int arr[],int n){

        int result[]=new int[2];
        int MaxValue=0;
        boolean found=false;

        for(int i=0;i<n;i++){

            for(int j = 0;j<n;j++){
                if(i!=j &&arr[i]+arr[j]==18){
                    if(arr[i]>arr[j]){
                        int product=arr[i]*arr[j];

                    
                    if(product>MaxValue){
                        MaxValue=product;
                        result[0]=arr[i];
                        result[1]=arr[j];
                        found=true;
                        return result;

                    }
                }


            }
        }
        
    }
    return found? result:new int[0];
}

    
    public static void main(String[] args) {
        
        int arr[]= {11,1,2,8,10,11,15,7};
        int n=8;
       int ans[]= findPair(arr,n);
       for(int i=0;i<2;i++){
        System.out.println(ans[i]);
       }
    }
    
}
