package SubArray;

public class PreSlidingWindowPbm {
    public static void main(String[] args) {
      
        int arr[]={-3,4,-2,5,3,-2,8,2,1,4};
        int k=4;

        int left=0;
        int right=k-1;
        int count=0;
        while (right<arr.length) {
            count++;
            left++;
            right++;
            
        }


        System.out.println(count);

    }
    
}
