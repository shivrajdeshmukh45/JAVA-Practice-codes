// Q3. WAP to find the second largest element in an array.
// Example:
// Input:
// Enter the size :4
// Enter the elements of the array:
// 1
// 2
// 3
// 4
// Output:
// The second largest element in the array is: 3



package Arrays.Array4;

import java.util.*;

public class Que3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Arrray:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int maxNum = arr[0];
        int secM = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != maxNum && secM < maxNum && secM != maxNum) {
                secM = arr[i];
            }

        }
        System.out.println("Second largest no: " + secM);
    }
}
