
// Q3. Write a program to check the count of the user given key in your array, if
// the count is more than 2 times replace the element with its cube, print the
// array.
// Example:
// arr1:
// 11 6 8 9 5 8 7 8 6

// Input 1:
// Enter key: 8
// Output
// Array will be like :
// 11 6 512 9 5 512 7 512 6
package Arrays.Array6;

public class Que3 {
    public static void main(String[] args) {
        int arr[]=new int[]{11,6,8,9,5,8,7,8,6};

        //user
        int count=0;
        for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    count++;
                    if(count>2){
                        arr[i]=arr[j]*arr[j]*arr[j];
                    }
                   
            
            
            }
           
        }
    }
        System.out.println(count);
        System.out.println("Array will be like :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
    
}

