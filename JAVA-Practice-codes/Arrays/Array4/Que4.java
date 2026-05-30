// 
package Arrays.Array4;

import java.util.Scanner;

public class Que4 {
      public static void main(String[] args) {
    
            Scanner sc=new Scanner(System.in);
    
            System.out.print("Enter the size of Arrray:");
            int size= sc.nextInt();
    
            int arr[]=new int[size];
    
    
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
    
            }
        
            System.out.print("Enter the number to check:");
            int numTocheck=sc.nextInt();

        int count=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==numTocheck){
                count++;
                if(count>=2){
                    System.out.println("Number occurance :"+count);
                }else{
                    System.out.println(numTocheck+" Number occur only once");
                }
            }
           
            }
           // System.out.println("number occur"+count);
            

        }


    
}
