import java.util.Scanner;

public class Deloitte {
    public static void main(String[] args) {
        // Read input
        Scanner scanner = new Scanner(System.in);
        String dNum = scanner.nextLine();
        String bNum = scanner.nextLine();
        
        // Initialize the result string
        StringBuilder res = new StringBuilder();
        
        // Iterate through both strings and check corresponding binary digit
        for (int i = 0; i < dNum.length(); i++) {
            if (bNum.charAt(i) == '1') {
                res.append(dNum.charAt(i));
            }
        }
        
        // Print the result
       
        System.out.println(res.toString());
    }
}
