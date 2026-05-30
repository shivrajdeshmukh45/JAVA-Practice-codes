// 6. Write a program where you have to take input from the user for a character array and
// print the characters.

package Arrays.Array1;
import java.util.Scanner;
public class Que6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of array:");

        int size= sc.nextInt();
        char arr[]= new char[size];

        for(int i=0;i<arr.length;i++){

            arr[i]=sc.next().charAt(0);
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }

    
}
