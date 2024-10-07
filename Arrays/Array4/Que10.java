
// Q10.Write a program to print the characters in an array which comes before the user
// given character.
// Output:
// Input:
// Enter the size:
// 6
// Enter Elements
// A B Y G H P
// Enter character key :
// H
// Output:
// Array:
// A
// B
// Y
// G
package Arrays.Array4;

import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {
        int index=0;

        Scanner sc= new Scanner(System.in);
        char arr[]=new char[]{'A', 'B', 'Y', 'G', 'H','P'};

        System.out.print("Enter the character key:");
        char key= sc.next().charAt(0);

        for(int i=0;i<arr.length;i++){


            for(int j=0;j<arr.length;j++){
                if(arr[j]==key){
                    index=j;
                }
            }
        }


        for(int i=0;i<index;i++){
            System.out.println(arr[i]);

        }
        
    }
    
}
