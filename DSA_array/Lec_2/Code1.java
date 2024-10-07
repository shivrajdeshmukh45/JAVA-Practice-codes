//Given an array of size n and Queries
//Querey Contains two parameters (s,e),
//for all queries print the sum of all element
//Arr:-3,6,2,4,5,2,8,-9,3,1

package DSA_array.Lec_2;

import java.util.Scanner;

public class Code1 {
    

    static int Queries(int start,int end){
        int sum=0;
        int arr[]=new int[]{3,6,2,4,5,2,8,-9,3,1};

        if(end<arr.length){

        for(int i=start;i<=end;i++){
            sum=sum+arr[i];

        }
        
    }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter start index:");
        int s=sc.nextInt();
        
        System.out.print("Enter start index:");
        int e=sc.nextInt();
        
       int  arrsum=Queries(s, e);
       System.out.println(arrsum);


    }
    
}
