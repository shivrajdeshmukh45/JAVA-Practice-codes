
// Q2.WAP to find the difference between minimum element in an array and maximum
// element in an array, take input from the user.
// Example :
// Input:
// Enter the size :
// 5
// Enter the elements of the array:
// 3
// 6
// 9
// 8
// 10
// Output
// The difference between the minimum and maximum elements is: 7
package Arrays.Array4;

import java.util.Scanner;

public class Que2 {
     public static void main(String[] args) {
    
            Scanner sc=new Scanner(System.in);
    
            System.out.print("Enter the size of Arrray:");
            int size= sc.nextInt();
    
            int arr[]=new int[size];
    
    
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
    
            }
        int maxNum=arr[0];
        int minNum=arr[0];

        
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxNum){
                maxNum=arr[i];
            }else if(arr[i]<minNum){
                minNum=arr[i];
            }
            

        }
        int diff=maxNum-minNum;

        System.out.println("The difference between the minimum and maximum elements is:"+diff);
}
}
