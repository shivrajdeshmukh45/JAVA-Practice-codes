package DSA_array.BinarySearch;

public class Ceiling {

    static int ceilingEle(int arr[],int target){

        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid=start +(end-start)/2;

            // if(arr[mid]==target){
            //     return mid;
            
            // }
             if (target>arr[mid]) {
                start=mid+1;
                
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
          
            
        }
        System.out.println(arr[start]);
        return start;

        
    }


    public static void main(String[] args) {
        int arr[]=new int[]{2,3,5,9,14,16,18};
        int target=15;
        int ans=ceilingEle(arr,target);
        System.out.println(ans);
    }
    
}
