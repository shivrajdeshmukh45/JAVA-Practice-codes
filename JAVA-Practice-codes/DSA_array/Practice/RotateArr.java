package DSA_array.Practice;

import java.util.Scanner;

public class RotateArr {

    static int[] RotateArr(int arr[],int k){
        int n=arr.length;
        k=k%n;
        

        int ans[]=new int[n];
        int j=0;

        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int s=0;s<n-k ;s++){
            ans[j++]=arr[s];

        }

        return ans;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{1,2,3,4,5,6,7};

        System.out.print("Enter the Value of K :");

        int k=sc.nextInt();

      int ans[]=  RotateArr(arr,k);
   
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        

 

    }

}
