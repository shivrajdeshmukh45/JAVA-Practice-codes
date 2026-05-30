
// 4.WAP to search a specific element in an array and return its index. Ask the user to
// provide the number to search, also take size and elements input from the user.
// Example:
// Input:
// Enter the size
// 5
// Enter elements:
// 12
// 144
// 13
// 156
// 8
// Enter the number to search in array:
// 8

// Output:
// 8 found at index 4
package Arrays.Array2;
import java.util.*;
public class Que4 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

            System.out.print("Enter the size:");
            int size= sc.nextInt();
            int arr[]=new int[size];


            System.out.println("Enter the elements:");


            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

            System.out.print("Enetr the number to search in array:");
            int num=sc.nextInt();

            for(int i=0;i<arr.length;i++){
                if(arr[i]==num){
                    System.out.println(arr[i]+" found at index "+i);
                }
            }


    }
}
