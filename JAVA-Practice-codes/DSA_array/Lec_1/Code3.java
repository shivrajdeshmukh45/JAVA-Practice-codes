//GIVEN AN ARRAY OF size n
// Reverse the array without Using extra space
//Space Complexcity :O(1)
//arr=[8,4,1,3,9,2,6,7]

package DSA_array.Lec_1;

public class Code3 {
    public static void main(String[] args) {
        
        int arr[]= new int[]{8,4,1,3,9,2,6,7};

        int i=0;
        int j=arr.length-1;

        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        for(;i<arr.length;i++)
        System.out.print(arr[i]+"  ");
    }
    
    
}
