
// 10. WAP to print the Maximum element in the array.
// Example:
// Input:
// Enter the size
// 5
// Enter elements:
// 7
// 81
// 65
// 12
// 23
// Output:
// Maximum number in the array is found at pos 1 is 81
package Arrays.Array2;

import java.util.Scanner;

public class Que10 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

            System.out.print("Enter the size:");
            int size= sc.nextInt();
            int arr[]=new int[size];


            System.out.println("Enter the elements:");


            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int max=arr[0];
            int maxPos=0;

            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                    maxPos=i;
                    
                }


            }
            System.out.println("Maximum number in array found at "+maxPos +"  is "+max);

}
}
