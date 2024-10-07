package DSA_array.BinarySearch;

 public class FirstandLastPosition {


    public static void main(String[] args) {
         int arr[]={3,7,7,7,7,8,8,10};
         int target=7;
         searchRange(arr, target);
        
    }

    static int[] searchRange(int arr[],int target){


        int ans[]={-1,-1};
        //check for if first occurance is target first
        int start=search(arr, target, true);
        int end=search(arr, target, false); //check for if first occurance is target last
         ans[0]=start;
         ans[1]=end; 
         
         System.out.println(start);
         System.out.println(end);

         return ans;
        

    }
   
    // this fuction returns the index of first or last element of the target depending on boolen value
    static int search(int arr[],int target,boolean firstIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid=start +(end-start)/2;

            
             if (target>arr[mid]) {
                start=mid+1;
                
            }else if(target<arr[mid]){
                end=mid-1;
            }else{

                mid=ans;
            }
                if(firstIndex==true){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            
            
        }
        return ans;
    }
}
       
    
     

    
    

 