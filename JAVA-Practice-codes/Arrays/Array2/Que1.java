
// 1.WAP to count the even numbers in an array where you have to take the size and
// elements from the user. And also print the even numbers too
// Example:
// Enter size =8
// 1 12 55 65 44 22 36 10
// Output : even numbers 12 44 22 36 10
// Count of even elements is : 5
package Arrays.Array2;

import java.util.Scanner;

public class Que1 {

   
 public static void main(String[] args) {
     int count=0;

       Scanner sc=new Scanner(System.in);

       System.out.print("Enter the size of Arrray:");
       int size= sc.nextInt();

       int arr[]=new int[size];


       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();

       }
       System.out.print("Event Elements are :");
       for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
                System.out.print(arr[i]+" ");
            }

           

       } System.out.println();
       System.out.println("Count od Even Element is:"+count);

    
}
}
