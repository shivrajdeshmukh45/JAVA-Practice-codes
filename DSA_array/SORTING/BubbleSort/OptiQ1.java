package DSA_array.SORTING.BubbleSort;

public class OptiQ1 {
    public static void main(String[] args) {
        boolean swapped;
        int count=0;
        int arr[]={1,2,3,4,5,6,7};
        

        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=0;j<arr.length-i-1;j++){

                count++;
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
        System.out.println(count);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
