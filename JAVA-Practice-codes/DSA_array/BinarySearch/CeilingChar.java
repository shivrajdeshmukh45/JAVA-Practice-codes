// Find Smallest Letter Greater Than Target
//Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.
//For example, if target z' and letters=['a', b'], the answer is 'a'.

// Example 1:
// Input: letters = ["c","f", "j"], target = "a"
// Output: "c"
package DSA_array.BinarySearch;

public class CeilingChar {

    static char ceilingEle(char arr[],char target){

        int start=0;
        int end=arr.length-1;

        if(target>=arr[arr.length-1]){
            return (char) -1;
        
        }

        while (start<=end) {
            int mid=start +(end-start)/2;

          
             if (target>arr[mid]) {
                start=mid+1;
                
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return arr[mid];
            }
          
            
        }
       // System.out.println(arr[start]);
        return arr[start];

        
    }


    public static void main(String[] args) {
        char arr[]=new char[]{'c','f','j'};
        char target='a';
        char ans=ceilingEle(arr,target);
        System.out.println(ans);
    }
    
}
