package DSA_array.Lec_3;

public class Code1 {
    public static void main(String[] args) {
        int arr[]= new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int maxEle=Integer.MIN_VALUE;
        int N=arr.length;
        int leftMax[]=new int[N];

        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                if (maxEle<arr[j]) {
                    maxEle=arr[j];

                    
                }
                leftMax[i]=maxEle;
            }
        }

        for(int i=0;i<leftMax.length;i++){
            System.out.print(leftMax[i]+" ");
        }
    }
    
}
