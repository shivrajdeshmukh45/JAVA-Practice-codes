package InterviewPrep;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AccQ1 {
    static int buyCandii(int arr[],int m){
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%5==0){
                count++;
            }else if(m>=arr[i]){
                count++;
                m=m-arr[i];
            }
          
        }
        System.out.println(count);
        return count;



    }



public static void main(String[] args) {
    int M=7;
    int arr[]= new int[]{4,5,7,2,15,20};
    Arrays.sort(arr);
    buyCandii(arr,M);
   
    
}
    
    
}
