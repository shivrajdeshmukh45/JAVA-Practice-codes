// 3. Write a program to print the even elements in the array. Take input from the user.
// Example :
// Enter size : 10
// Array:
// 10 11 12 13 14 15 16 17 18 19


package Arrays.Array1;
import java.util.*;
public class Que3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of Arrray:");
        int size= sc.nextInt();

        int arr[]=new int[size];


        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){
             
                System.out.print(arr[i]+" ");
            }
           
            
        }
        System.out.println();






        
    }

    
}
