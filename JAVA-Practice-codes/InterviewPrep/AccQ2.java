package InterviewPrep;

public class AccQ2 {

    public static int checkIndex(int arr[],int d,int q,int r){

        int divident=(d*q)+r; ///Formula Dividenet=Divisior*Que +rem
        int ans=-1;         
        for(int i=0;i<arr.length;i++){

            if(arr[i]==divident){
                 ans=i;
                break;
            }
        }
        System.out.println(ans);
        return ans;
    }


    public static void main(String[] args) {
        int arr[]={5,6,7,9,10};
        int D=2,Q=3,R=1;

        checkIndex(arr,D,Q,R);
    }
    
}
