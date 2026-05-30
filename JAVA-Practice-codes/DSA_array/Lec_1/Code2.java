
//given an array of size n.
//return the count of pairs(i,j) with Arr[i]+arr[j]=K           additoin =10;arr[i]+arr[j]=10
//K=10
//{3,5,1,-3,7,8,15,,6,3}
//N=10


//NOTE i!=j

package DSA_array.Lec_1;

public class Code2 {
    public static void main(String[] args) {
        
        int count=0;
        int k=10;
        int itr=0;
        int arr[]=new int[]{3,5,2,1,-3,7,8,15,6,13};


        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
          
                if(i!=j){

                    if(arr[i]+arr[j]==k){
                        count++;
                    }
            }
            }
        }
        System.out.println("output :"+count);
        System.out.println("Number of Iteration :"+itr);
    }
    
}
