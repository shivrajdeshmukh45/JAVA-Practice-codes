// 9. Write a program where you have to print the odd indexed elements. Take input from
// the user
// Example :
// Enter size: 10.
// 1 2 3 4 5 6 7 8 9 10
// 2 is an odd indexed element
// 4 is an odd indexed element
// 6 is an odd indexed element
// 8 is an odd indexed element
// 10 is an odd indexed element


package Arrays.Array1;
    import java.util.*;
    public class Que9 {
        public static void main(String[] args) {
    
            Scanner sc=new Scanner(System.in);
    
            System.out.print("Enter the size of Arrray:");
            int size= sc.nextInt();
    
            int arr[]=new int[size];
    
    
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
    
            }
    
            for(int i=0;i<arr.length;i++){
    
                if(i%2==1){
                 
                    System.out.println(arr[i]+"is an odd indexed element");
                }
               
                
            }
            System.out.println();
    
    
    
    
    
    
            
        }
    
        
    }
    
