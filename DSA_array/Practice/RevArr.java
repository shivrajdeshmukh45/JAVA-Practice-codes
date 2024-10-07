package DSA_array.Practice;

public class RevArr {
    public static void main(String args[]){

        int arr[]= new int[]{1,2,3,4,5,6,7,8};
     
        reverseAr(arr);
        for (int k=0;k<arr.length;k++) {
            System.out.print( arr[k]+" ");
        }
       

    }
        
    static void swapNum(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }


        static int[] reverseAr(int arr[]){
            int n=arr.length;
            int i=0;
            int j=n-1;
            while (i<j) {
                swapNum(arr,i,j);
                i++;
                j--;
                
            }
            return arr;

          
          
    }

}


