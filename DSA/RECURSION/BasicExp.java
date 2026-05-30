package RECURSION;

public class BasicExp {

    public static void printSum(int n){

        if (n==0) {
            return;
            
        }
        System.out.println(n);
        printSum(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        printSum(n);
    }
    
}
