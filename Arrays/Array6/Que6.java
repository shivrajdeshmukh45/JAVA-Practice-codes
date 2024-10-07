// Q6. Write a program to check whether the array contains element multiple of
// user given int value, if yes then print it’s index.
// Example :
// 5 10 16 20 25 30 35 4 8 12 16 20
// Input 1:
// Enter key : 5
// Output:
// An element multiple of 5 found at index : 0
// An element multiple of 5 found at index : 1
// An element multiple of 5 found at index : 3
// An element multiple of 5 found at index : 4
// An element multiple of 5 found at index : 5
// An element multiple of 5 found at index : 6
// An element multiple of 5 found at index : 11
package Arrays.Array6;
import java.util.*;

public class Que6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the key:");
        int key=sc.nextInt();
        
        int arr[]=new int[]{5,10,16,20,25,30,35,4,8,12,16,20};
            
        for(int i=0;i<arr.length;i++){
            if(arr[i]%key==0){
                System.out.println("An element multiple of 5 found at index :"+i);
            }else{
                System.out.println("Element Not Found");
                break;
            }
        }
    }
    
}
