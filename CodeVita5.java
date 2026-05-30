import java.util.*;

public class CodeVita5 {
public static void main(String[] args) {
    int arr[]={13,4,6,9,45,6,3,14};

    int max=arr[0];
    int secMax=arr[0];

    for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
    }
      for (int i = 0; i < arr.length; i++) {
            if (arr[i]>secMax && max>secMax) {
                secMax=arr[i];
            }
    }
System.out.println(" Max Ele "+max);
    System.out.println("Second Max Ele "+secMax);
}
  
}
