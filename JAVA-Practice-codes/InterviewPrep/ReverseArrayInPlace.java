package InterviewPrep;

public class ReverseArrayInPlace {
    static int[] swapArray(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;

        while (i<j) {
            int temp=arr[i];
             arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
            
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7};

        swapArray(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

