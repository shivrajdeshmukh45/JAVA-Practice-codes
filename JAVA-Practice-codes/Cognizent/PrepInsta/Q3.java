// Question-3
// Problem Statement – Ritik wants a magic board, 
//which displays a character for a corresponding number for his science project. 
//Help him to develop such an application.
// For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to be displayed.
// [Assume the number of inputs should be always 4 ]

// Sample Input 1:

// Enter the digits:
// 65
// 66
// 67
// 68
// Sample Output 1:

// 65-A
// 66-B
// 67-C
// 68-D

package Cognizent.PrepInsta;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=5;i++){
        char num=(char)sc.nextInt();
        //char ch=(char)num;
        System.out.print(num );
        }
        }
    
}
