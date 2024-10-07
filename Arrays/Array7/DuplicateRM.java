package Arrays.Array7;

class DuplicateRM{
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,2,3,4,4,5,6,6,7};
        int N=arr.length;
        int j=0;

        //int newArr[]= new int[N];



        for(int i=0;i<N-1;i++){
            if(arr[i]!=arr[i+1]){       //
                arr[j++]=arr[i];
            }
        }

        arr[j++]=arr[arr.length-1];

        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }



    }
}