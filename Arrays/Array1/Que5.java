// 5. Write a program where you have to print the elements from the array which are less
// than 10.Take input from the user.
// Example:
// Enter size: 10

// 11 2 18 9 10 5 16 20 8 10
// Output :
// 2 is less than 10
// 9 is less than 10
// 5 is less than 10
// 8 is less than 10


package Arrays.Array1;

import java.util.Scanner;

public class Que5 {
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

            if(arr[i]<10){
                System.out.println(arr[i]+" is less than 10");

            }
        }
        
    }

    
}
