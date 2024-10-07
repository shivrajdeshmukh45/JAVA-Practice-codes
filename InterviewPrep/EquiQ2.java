package  InterviewPrep;


class EquiQ2{

        static int findIndex(int arr[]){
            int arrSum=0;
            int leftSum=0;

            for(int num:arr){
                arrSum+=num;

               
            }
            System.out.println(arrSum);

            //Code for calculating equilibrium element


            for(int i=0;i<arr.length;i++){
                if(leftSum==arrSum-leftSum-arr[i]){
                    return i;
                }
                leftSum+=arr[i];
            }

        return-1;
        }




    public static void main(String[] args) {
        int arr[]= new int[] {9, 3, 7, 6, 8, 1, 10};

        int eqIndex=findIndex(arr);
        if(eqIndex!=-1){
            System.out.println("Equilibrium index found at :"+eqIndex);
        }else{
            System.out.println("Equilibrium index not found");
        }
    }


}