
// Q4. You have to take two different 1d arrays of the same size and print the
// common elements from the arrays.
// arr1
// 45 67 97 87 90 80

// arr2
// 15 97 67 80 90 10

// Output:
// Common elements in the given arrays are: 67, 97, 90, 80
package Arrays.Array6;

public class Que4 {
    public static void main(String[] args) {
        
        int arr1[]=new int[]{45,67,97,87,90,80};
        int arr2[]=new int[]{15,97,67,80,90,10};

        System.out.print("Common elements in the given arrays are:");

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr2[j]+" ");
                }
            }
        }
    }
    
}
