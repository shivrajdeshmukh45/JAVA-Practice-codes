package CyclicSort;


//Cyclic sort is only used for the Sequential Data or Continueous data
import java.util.Arrays;

public class Pr1 {

    static void sort(int arr[]){

        int  i=0;
       
        while (i<arr.length) {
            int correct=arr[i]-1;          // [1,2,3,4,5]

            //here If Array elements are sorted the increment the the vlue of i
            
            if (arr[i]!=arr[correct]) {
                swapped(arr,i,correct);

                
            }else{
                i++;
            }
            
        }
    }
    static void swapped(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }

    public static void main(String[] args) {
        int arr[]={3,4,1,2,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
