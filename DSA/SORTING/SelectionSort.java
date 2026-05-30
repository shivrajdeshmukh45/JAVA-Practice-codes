

class SelectionSort{

    public static void selection(int arr[]){


        int n=arr.length;
        
        for (int i = 0; i <n-1; i++) {
            
            int minIdx=i;

            for (int j = i+1; j < arr.length; j++) {

                if (arr[j]<arr[minIdx]) {
                    minIdx=j;

                    
                }
                
            }

            int temp=arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=temp;

        }

        for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]+" ");   
        }
    }
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        selection(arr);
        
    }

}