package Arrays.Array1;
import java.lang.reflect.Array;
import java.util.*;
class Que1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of Array:");
        int size=sc.nextInt();


        int arr[]= new int[size];


        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        
        System.out.println(Arrays.toString(arr));
        
    }
}