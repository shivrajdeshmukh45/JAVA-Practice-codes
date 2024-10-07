// Q10. WAP to print the factorial of each element in an array.
// Example :
// Input:
// Enter the size of the array:
// 6
// Enter the elements of the array:
// 1
// 2
// 3
// 5
// 8
// 2

// Output:
// 1, 2, 6, 120, 40320, 2
package Arrays.Array5;

public class Que10 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,5,8,2};

        for(int i=0;i<arr.length;i++){
            int fact=arr[i];
            for(int j=1;j<arr[i];j++){
                 fact=fact*j;
                 
                 

            }
            System.out.println(fact);
           

        }
    }
    
}
