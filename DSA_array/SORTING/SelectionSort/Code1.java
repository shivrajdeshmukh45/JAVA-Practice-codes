package DSA_array.SORTING.SelectionSort;

public class Code1 {

   static int[] selectonSort(int arr[]){
            int n=arr.length;

            for(int i=0;i<n-1;i++){

                int element=i;

                for(int j=i+1;j<n;j++){
                    if (arr[j]<arr[element]) {
                        element=j;
                        
                    }
                }
                int temp=arr[i];
                arr[i]=arr[element];
                arr[element]=temp;
            }

            return arr;



   }

    public static void main(String[] args) {
        int arr[]=new int[]{9,2,5,4,8,6,13,7};
        selectonSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"|");
        }

    }
    
}
