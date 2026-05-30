package Arrays.Array1;
import java.lang.reflect.Array;
import java.util.*;


class Que1{
     public static void main(String[] args) {
        int arr[]={1,5,9,8,7,6};
        int num=8;
        

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
             System.out.print(i+": index");
             break;
            }
            
           
        }
    }
    
    }