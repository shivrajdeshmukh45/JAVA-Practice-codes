//Simple code
package DSA_array.SORTING.BubbleSort;

public class BubbleSort1 {
    public static void main(String[] args) {
        int arr[]={7,3,9,4,2,5,6};
        

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
