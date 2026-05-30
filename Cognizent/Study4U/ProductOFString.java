package Cognizent.Study4U;

public class ProductOFString {
    public static void main(String[] args) {
        
        int arr[] = {12, 11, 6, 1, -1, 23, 12, 1, 28, -43, 6, 98, 11, 2, 7, 88, 9, -4, -54, 25, 19, -12, -32, 65, 3, -9};
        String str1 = "Spring";
        String str2 = "Hibernate";
        String str3 = "AND";
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        // Process str1
        for (int i = 0; i < str1.length(); i++) {
            int index = getMappedIndex(str1.charAt(i)); // Get mapped index
            if (index >= 0 && index < arr.length) {
                sum1 += arr[index];
            }
        }

        // Process str2
        for (int i = 0; i < str2.length(); i++) {
            int index = getMappedIndex(str2.charAt(i)); // Get mapped index
            if (index >= 0 && index < arr.length) {
                sum2 += arr[index];
            }
        }

        // Process str3
        for (int i = 0; i < str3.length(); i++) {
            int index = getMappedIndex(str3.charAt(i)); // Get mapped index
            if (index >= 0 && index < arr.length) {
                sum3 += arr[index];
            }
        }

         // Calculate product
        int product = sum1 * sum2 * sum3 ;
        System.out.println("Product: " + product); // Output should be 106470
    }


    // Method to map character to index in array
    public static int getMappedIndex(char c) {
        if (Character.isLowerCase(c)) {
            return c - 'a'; // Map 'a' to 0, 'b' to 1, etc.
        } else if (Character.isUpperCase(c)) {
            return c - 'A'; // Map 'A' to 0, 'B' to 1, etc.
        }
        return -1; 
    }
}
 