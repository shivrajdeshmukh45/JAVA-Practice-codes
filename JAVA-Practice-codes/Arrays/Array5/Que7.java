
// Q7. WAP to find the composite numbers in an array.
// Example :
// Input:
// Enter the size of the array:
// 6
// Enter the elements of the array:
// 10
// 22
// 3
// 31
// 50
// 3

// Output:
// Composite numbers in an array are: 10, 22, 50
package Arrays.Array5;

public class Que7 {
    public static void main(String[] args) {
        int arr[]=new int[]{10,22,3,31,50,3};

System.out.print("Composite numbers in an array are:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(+arr[i]+" ");
             
            
            }
        }
    }
    
}
