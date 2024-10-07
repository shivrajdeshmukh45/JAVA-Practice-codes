// Q10. Write a program to find the third largest element in an array.
// Example :
// 56 15 8 26 7 50 54

// Output:
// Third largest element is: 50
package Arrays.Array6;

public class Que10 {
    
    public static void main(String[] args) {
        int maxEle=0;
        int secmaxEle=0;
         int ThiredmaxEle=0;

         int arr[]=new int[]{56,15,8,26,7,50,54};
        for(int i=0;i<arr.length;i++){

            if(arr[i]>maxEle){
                maxEle=arr[i];
          
            } else if(arr[i]<maxEle && arr[i]>secmaxEle){
                secmaxEle=arr[i];
               
            }
        }

//Third largest element in the Array
        for(int i=0;i<arr.length;i++){
             if(arr[i] >ThiredmaxEle && arr[i] < secmaxEle){
            ThiredmaxEle=arr[i];
        }
         
        }
      

        System.out.println("first largest element is: "+maxEle);
        System.out.println("Second largest element is: "+secmaxEle);
        System.out.println("Third largest element is: "+ThiredmaxEle);
    }
    
}

