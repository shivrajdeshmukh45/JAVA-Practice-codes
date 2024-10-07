
// Q5. WAP to print the count of digits in elements of an array.
// Example :
// Input:
// Enter the size of the array:
// 4
// Enter the elements of the array:
// 1
// 225
// 32
// 356

// Output:
// 1, 3, 2, 3
package Arrays.Array5;

public class Que5 {
    

    public static void main(String[] args) {
     
        int arr[]=new int[]{1,225,32,356};

        for(int i=0;i<arr.length;i++){
          int count=digitCount(arr[i]);
            System.out.print(count+" ");
        }

        }
                        
       static int digitCount(int num){
        int count=0;
        while (num!=0) {
            num/=10;
            count++;
            
        }
        return count;


    }
}

