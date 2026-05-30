import java.util.Random;
import java.util.Scanner;

public class RandomCls {

    public static void main(String[] args) {
        
        Random r= new Random();

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number of Question you Want  :");
        int Q=sc.nextInt();


        for (int i = 0; i <= Q; i++) {
            

            int a=r.nextInt(2,20);
            int x=r.nextInt(2,20);
            int b=r.nextInt(2,20);
            
            
            String que=a+"x"+"+"+b+"="+"c";
            System.out.println(que);

        }

        
    }

    
}
