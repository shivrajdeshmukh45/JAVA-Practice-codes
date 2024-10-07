package Arrays.Array1;

import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {
       

       Scanner sc=new Scanner(System.in);

       System.out.print("Enter the count od Employee:");
       int size= sc.nextInt();

       int arr[]=new int[size];


       for(int i=0;i<arr.length;i++){
            System.out.print("Enter the Age:");
           arr[i]=sc.nextInt();

       }
       for(int i=0;i<arr.length;i++){
            System.out.print("ages of Employees are:");
            System.out.println(arr[i]);
       }


    
}
}
