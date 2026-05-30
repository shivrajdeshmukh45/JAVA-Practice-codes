
public class BubbleSort {


    //Bubble Sort is the simplest sorting algorithm
    // that works by repeatedly swapping the adjacent elements if they are in the wrong order. 

    public static void bubble(int arr[]){
        int n=arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j < n-i; j++) {
                if (arr[j]<arr[j-1]) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                    
                }
                
            }
        }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            
        }
    
    
    public static void main(String[] args) {
        int[] arr =     
        bubble(arr);
        
    }
}
    

