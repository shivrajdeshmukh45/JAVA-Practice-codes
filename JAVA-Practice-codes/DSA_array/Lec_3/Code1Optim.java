package DSA_array.Lec_3;

public class Code1Optim {
    
    
    public static void main(String[] args) {
        int arr[]= new int[]{-3,6,2,4,5,2,8,-9,3,1};
       
        int N=arr.length;

        int leftMax[]=new int[N];

        leftMax[0]=arr[0];
        int maxEle=Integer.MIN_VALUE;

//Optimized Apporch 
        //main Logic of code
        for(int i=1;i<N;i++){
         
           
                if (leftMax[i-1]<arr[i]) {
                    leftMax[i]=arr[i];

                }else{
                    leftMax[i]=leftMax[i-1];
                }   
             
                leftMax[i]=maxEle;
            }
        

        for(int i=0;i<leftMax.length;i++){
            System.out.print(leftMax[i]+" ");
        }
    }
}
