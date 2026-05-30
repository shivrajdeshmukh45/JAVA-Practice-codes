// 4. Write a program to print the sum of odd elements in an array.Take input from the user.
// Example:
// Enter size: 10
// Array:
// 1 2 3 4 2 5 6 2 8 10
// Output :
// Sum of odd elements : 9


package Arrays.Array1;

import java.util.*;
public class Que4 {
    public static void main(String[] args) {
        int sum=0;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of Arrray:");
        int size= sc.nextInt();

        int arr[]=new int[size];


        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==1){
                sum=sum+arr[i];

            }
        }
        System.out.print("Sum of Odd number:"+sum);
    }
}