package InterviewPrep;

import java.util.Scanner;

public class RotateArray {

    static int[] rotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int j=0;

        int ans[]=new int[n];

        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];

        }
        for(int i=0;i<n-k-1;i++){
            ans[j++]=arr[i];
        }
        

        return ans;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int arr[]=new int[]{1,2,3,4,5,6};
        System.out.print("Enter the Steps to Rotate:");
        int k=sc.nextInt();
       int ans[]= rotate(arr,k);

        for(int i=0;i<ans.length-1;i++){
            System.out.print(ans[i]+" ");

        }

    }
    
}
