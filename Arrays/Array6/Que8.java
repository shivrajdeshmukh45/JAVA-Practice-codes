// Q8. Write a program to reverse the char array and print the alternate
// elements of the array before and after reverse.

// Size = 10
// A B C D E F G H I J

// After reverse :

// J I H G F E D C B A

// Output :
// Before Reverse:
// A C E G I

// After Reverse:

// J H F D B

package Arrays.Array6;

public class Que8 {
    public static void main(String[] args) {
        
        char arr[]=new char[]{'A','B','C','D','E','F','G','H','I','J'};

        for(int i=0;i<arr.length/2;i++){
           char temp=arr[i];
           arr[i]=arr[arr.length-1-i];
           arr[arr.length-1-i]=temp;

        }

        System.out.print("Reversed Array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
