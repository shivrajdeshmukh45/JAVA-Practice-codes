// Q1. WAP to check whether the array is in ascending order or not.
// Input 1:
// Enter the size of the array:
// 4
// Enter the elements of the array:
// 1
// 5
// 9
// 15
// Output 1:
// The given array is in ascending Order.
package Arrays.Array5;

public class Que1 {

    public static void main(String[] args) {
      int num=0;
        boolean isAsend =false;
    
    int arr[]=new int[]{1,9,11,14};

    for(int i=0;i<arr.length;i++){
        if(arr[i]>num ){
            num=arr[i];
            System.out.println(arr[i]);
            isAsend=true;
          
        }else{
            isAsend=false;
           
        }

    }
    if(isAsend==true){
        System.out.println("array is  in Assending Order");
    }
    else{
        System.out.println("array is  not in Assending Order");

    }
    
    
}
}
