package InterviewPrep;

class EquilibriumPoint{

    static int findEquilibPoint(int[] arr){
        int totalSum=0;
        int leftSum=0;

        //step one 1
        for (int num : arr) {
            totalSum+=num;
            
        }

        //Step 2

        for(int i=0;i<arr.length;i++){
            if(leftSum==totalSum-leftSum-arr[i]){
                return i;
            }
            leftSum+=arr[i];

        }
        return -1;
       
        
    }

    public static void main(String[] args) {
        int arr[]= new int[]{ -7, 1, 5, 2, -4, 3, 0 };

        int EquilibIndex=findEquilibPoint(arr);

        //If_else code to print find or not 

        if(EquilibIndex !=-1){
            System.out.print("Equilibrium index found at :"+EquilibIndex);
        }else{
            System.out.println("Equilibrium index found ");
        }
}
}