package DSA_array.Lec_2;

import java.util.Scanner;

public class PrifixSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        int arr[] = new int[]{3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        int n = arr.length;

        int psArr[] = new int[n];

        // Compute the prefix sum array
        psArr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            psArr[i] = psArr[i - 1] + arr[i];
        }
        int sum=0;
        System.out.print("Enter Q :");

         int Q=sc.nextInt();

         for(int i=0;i<Q;i++){
            int s=sc.nextInt();
            int e=sc.nextInt();
        //    sum=psArr[e]-psArr[s-1];

            if(s==0){
                sum=psArr[e];
            }else{
                sum=psArr[e]-psArr[s];
            }

    }
            System.out.println(sum);


         }
        
    }
    


