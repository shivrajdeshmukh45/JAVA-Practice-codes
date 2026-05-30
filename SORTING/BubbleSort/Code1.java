package BubbleSort;
import java.util.Arrays;

class Code1{

   static void bubbleSort(int arr[]){

    boolean swapped;
    for(int i=0;i<arr.length;i++){
        swapped=false;

        for(int j=1;j<arr.length-i;j++){

            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                swapped=true;

            }
        }
        if (swapped==false) {
            break;
            
        }
    }

    }
    public static void main(String[] args) {
        int arr[]={7,3,9,4,2,5,6,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        

    }
}