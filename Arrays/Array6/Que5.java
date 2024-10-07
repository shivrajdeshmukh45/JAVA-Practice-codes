// Q5. Take two different arrays where size of array may differ, you have to
// create an array by combining both the arrays (you have to merge the arrays)
// Example :

// arr1
// 5 10 15 20 25 30 35

// arr2
// 4 8 12 16 20

// Array after merger :

// 5 10 15 20 25 30 35 4 8 12 16 20

package Arrays.Array6;

public class Que5 {
    public static void main(String[] args) {
        int arr1[]=new int[]{5,10,15 ,20 ,25,30,35};
        int arr2[]=new int[]{4,8,12,16,20};

        int mergeArray[]=new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
          mergeArray[i]=arr1[i];
        }

        for(int i=0;i<arr1.length;i++){
            mergeArray[arr1.length+i]=arr1[i];
          }

          for(int i=0;i<mergeArray.length;i++){

            System.out.print(mergeArray[i]+" ");
        }
    }
    
}
