
// Q9. WAP to replace the elements with #, which are not in the range of ‘a to z’.
// Input:
// Enter the size:
// 6
// Enter Elements
// A
// B
// c
// d
// E
// *
// Output
// Array:
// #

// #
// c
// d
// #
// #
package Arrays.Array4;

import java.util.Scanner;

public class Que9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        char arr[] = new char[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 'a' || arr[i] > 'z') {
                arr[i] = '#';
            }
        }

        System.out.println("Output Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
