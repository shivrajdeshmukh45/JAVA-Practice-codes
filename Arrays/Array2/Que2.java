
// 2.WAP to print the sum of elements divisible by 3 in the array, where you have to take the
// size and elements from the user.
// Example:
// Enter size : 8
// 9 13 5 13 6 22 36 10
// output:
// Elements divisible by 3 : 9 6 36
// Sum of elements divisible by 3 is: 51
package Arrays.Array2;
import java.util.Scanner;

public class Que2 {

   
 public static void main(String[] args) {
     int sum=0;

       Scanner sc=new Scanner(System.in);

       System.out.print("Enter the size of Arrray:");
       int size= sc.nextInt();

       int arr[]=new int[size];


       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();

       }
       System.out.print("Element divisible bye 3:");
       for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                sum=sum+arr[i];
                System.out.print(arr[i]+" ");
            }

           

       } System.out.println();
       System.out.println("Sum  of Divisible by 3 Element is:"+sum);
       sc.close();

    
}
}
