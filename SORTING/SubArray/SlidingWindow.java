

//Given an array of size N
//find the count of maximum subarray SUM of K
//arr:{-3,4,-2,5,3,-2,8,2,1,4}
//k:4

//Output=15
package SubArray;

public class SlidingWindow {
    public static void main(String[] args) {
      
        int arr[]={-3,4,-2,5,3,-2,8,2,1,4};
        int k=4;

        int start=0;
        int end=k-1;
        
        int maxEle=Integer.MIN_VALUE;
        while (end<arr.length) {
            int sum=0;
            
            for (int i = start; i <=end; i++) {
                sum+=arr[i];
                
            }
            if (maxEle<sum) {
                maxEle=sum;
                
            
        }
            start++;
            end++;
        }

        System.out.println(maxEle); 

        

    }
    
}
