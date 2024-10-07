package Arrays.Array6;

public class ReverseArray {
    public static void main(String[] args) {
        
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};

        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }

        System.out.println("Reverse Array");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
