// Q2. Write a program to find out the sum of all prime numbers in an array and
// also print the count of prime numbers in an array.
// Example:

// 5 7 9 12 17 19 21 22

// Output:
// Sum of all prime numbers is 48 and count of prime numbers in the given array is 4

package Arrays.Array6;

public class Que2 {

    public static void main(String[] args) {
        int arr[]=new int[]{5,7,9,12,17,19,21,22};
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                System.out.println(arr[i]+" ");
                count++;
                sum=sum+arr[i];
            }
            

        }
  
        System.out.println( " Sum of all prime numbers is  :" +sum );
        System.out.println(" and count of prime numbers in the given array is :"+count);
        
    }
    static boolean isPrime(int number){

        if(number<=1){
            return false;
        }
    for(int i=2;i<+number/2;i++){
        if(number%i==0){
            return false;
        }
    }
    return true;
    }
    
}
