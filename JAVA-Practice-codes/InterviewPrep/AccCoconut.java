package InterviewPrep;

import java.util.Scanner;

public class AccCoconut {


    static int CountDay(int n,int e,int d ){
        if(n==0) return -1;
        if(e==0 || d==0) return 0;

        if(d<7) return ((d*e %n==0)?(d*e/n):(d*e/n+1));

        if(n*6 <e*7 ) return -1;

            int ans=0;

            int weeks=d/7;

            ans+=((weeks*e*7 )%n==0)?(weeks*e*7 /n):(weeks*e*7/n+1);



        //for remaining days

        int left=ans*n-weeks*7*e;


        int days=d%7;

        int req=days*e-left;

        ans+= (req%n==0)?(req/n):(req/n+1);
        System.out.println(ans);

        return ans;

       



    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N :");
        int N=sc.nextInt();

        System.out.print("Enter E :");
        int E=sc.nextInt();

        System.out.print("Enter D :");
        int D=sc.nextInt();

        CountDay(N,E,D);
    }
    
}
