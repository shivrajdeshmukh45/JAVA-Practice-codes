package InterviewPrep;

public class RotateArrayInPlace {

   static void reverse(int arr[],int i,int j){
        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
    }


    static void rotate(int arr[],int k){
       int n=arr.length;
        k=k%n;
        reverse(arr, 0,n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

        
    }

    public static void main(String[] args) {

        
        
        int arr[]= new int[]{1,2,3,4,5,6,7};
        int n=arr.length;
       int k=5;
        
       rotate(arr,k);

       for(int i=0;i<n;i++){

        System.out.print(arr[i]+" ");

       }
    }
    
}
