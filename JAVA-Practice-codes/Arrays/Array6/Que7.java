// Q7. Write a program to, where you have to take integer input from user and if
// the integer is in the range of ASCII value of A to Z, while saving you have to
// type cast the int to char. Print the array.
// Enter size :
// 7
// Enter array elements :

// 55
// 67
// 65
// 97
// 36
// 13
// 68

// Array will be like :
// arr1
// 55 C A a 36 13 D 

package Arrays.Array6;

public class Que7 {
    public static void main(String[] args) {

        int arr[]=new int[]{55,67,65,97,36,13,68};

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=65 && arr[i]<122){
                System.out.print((char)arr[i]+" ");
            }else{
                System.out.print(arr[i]+" ");
            }
        }
        
    }
    
}
