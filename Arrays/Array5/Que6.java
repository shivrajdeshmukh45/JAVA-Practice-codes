
// Q6. WAP to find the first prime number in an array.
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
// First prime number found at index 2
package Arrays.Array5;

public class Que6 {
    public static void main(String[] args) {
        int arr[]=new int[]{10,22,3,31,50,3};

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                System.out.println("First prime number found at index "+i);
                break;
            }
        }
    }
    
}
