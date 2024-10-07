package InterviewPrep;

public class Twopointer2 {
    static void printData(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }



    static void swapArray(int arr[],int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void sortArray(int arr[]){
        int n=arr.length;
        int left=0,right=n-1;

        while (left<right) {
            if(arr[left]%2==1 &&arr[right]%2==0){
                swapArray(arr,left,right);

                left++;
                right--;
            }

            if(arr[left]%2==0){
                left++;
            }
            if (arr[right]%2==1) {
                right--;
            }
            
        } 




    }

    public static void main(String[] args) {
        int arr[]= new int[]{1,3,2,4,5,6,7,8,9};
        sortArray(arr);
        printData(arr);
        
      

    }
    
}
