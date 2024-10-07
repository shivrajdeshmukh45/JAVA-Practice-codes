// Q2. WAP to print the sum of odd and even numbers in an array.
// Enter the size of the array:
// 6
// Enter the elements of the array:
// 10
// 15
// 9
// 1
// 12
// 15
// Output:
// Odd Sum = 40
// Even Sum = 22
package Arrays.Array5;

public class Que2 {
    public static void main(String[] args) {
        int sumOdd=0;
        int sumEven=0;
        int arr[]=new int[]{10,15,9,1,12,15};

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sumEven=sumEven+arr[i];
            }else{
                sumOdd=sumOdd+arr[i];
            }
        }
        System.out.println("Sum of Even Number:"+sumEven);
        System.out.println("Sum of Odd Number:"+sumOdd);
    }
    
}
