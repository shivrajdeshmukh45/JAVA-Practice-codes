// 7. Write a program to print the elements of the array which is divisible by 4. Take input
// from the user.
// Example:
// Enter size: 10
// 14 20 18 9 11 51 16 2 8 10
// Output:
// 20 is divisible by 4 and its index is 1
// 16 is divisible by 4 and its index is 6
// 8 is divisible by 4 and its index is 8

package Arrays.Array1;
import java.util.*;;

public class Que7 {
    public static void main(String[] args) {
       

       Scanner sc=new Scanner(System.in);

       System.out.print("Enter the size of Arrray:");
       int size= sc.nextInt();

       int arr[]=new int[size];


       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();

       }

       for(int i=0;i<arr.length;i++){

           if(arr[i]%4==0){
               System.out.println(arr[i]+" is Divisible by 4 and its index is "+i);

           }
       }
       System.out.println();
       
   }

   
}