package DSA_array.Lec_2;
import java.util.*;
class Code1_Optamize{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;

        int arr[]=new int[]{3,6,2,4,5,2,8,-9,3,1};
        int psArr[]=new int[arr.length];
        
         psArr[0]=arr[0];
        System.out.println(arr[0]);
        //addition
        for(int i=1;i<arr.length;i++){
           psArr[i]=arr[i-1]+psArr[i];
           System.out.print(psArr[i]+" ");
           
        }

        // for(int i=0;i<arr.length;i++){
        //     int s=sc.nextInt();
        //     int e=sc.nextInt();

        //     for(int j=0;j<arr.length;j++){
        //         int sum=arr[i]-arr[j-1];
        //         System.out.println(sum);
        //     }
            


        // }
    }
}