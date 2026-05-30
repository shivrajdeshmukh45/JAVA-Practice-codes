
public class InsersionSort {

    public static void insertion(int arr[]){

        int n=arr.length;

        for (int i = 1; i < n; ++i) {
            int key=arr[i];
            int j=i-1;


            while (j>=0 && arr[j]>key) {
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                j--;                
            }
            arr[j+1]=key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };    
    
        insertion(arr);
    }
    
}
