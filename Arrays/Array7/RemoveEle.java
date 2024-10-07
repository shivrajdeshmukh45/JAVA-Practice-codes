package Arrays.Array7;

public class RemoveEle {


    static int[] removeEle(int array[],int index){

        if (index < 0 || index >= array.length) {
            throw new IllegalArgumentException("Index out of bounds");

        }
        int newArr[]=new int[array.length-1];

        for(int i=0,j=0;i<array.length;i++){
            if(i!=index){
                newArr[j++]=array[i];
            }
        }
        return newArr;
    }


        public static void main(String[] args) {
            int arr[]= new int[]{1,2,3,4,5,3,6,7};
            int indexToRm=2;

            int result[]=removeEle(arr,indexToRm);
            
            for (int i : result) {
                System.out.print(i+" ");
            }

        }

    
}
