package InterviewPrep;

public class AccSumArrXOR {
    static int  findSum(int arr[]){
        int N= arr.length;
        int sum=0,Xor=0;

        if(N==0){
            return 0;
        }
        if(N==1){
            return arr[0];
        }


            sum=arr[0];
            Xor=arr[1];
        for(int i=2; i<N;i++){
            if(i%2==0){
                sum+=arr[i];
            }
            else{
                Xor=Xor^arr[i];
            }
        }
        return sum+Xor;
    }


    public static void main(String[] args) {
        int arr[]= {1,2,4,2,1};

        System.out.println(findSum(arr));
    }
    
}
