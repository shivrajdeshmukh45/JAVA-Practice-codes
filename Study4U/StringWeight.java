package Study4U;
public class StringWeight {

    // Method to calculate the weight of the given string
    public static int getStringWeight(int[] weights, String input) {
        String[] words = input.split(" ");
        int totalWeight = 1; // Product of all word weights

        for (String word : words) {
            int wordWeight = 0;

            for (int i = 0; i < word.length(); i++) {
                char ch = Character.toLowerCase(word.charAt(i));
                int alphabeticIndex = ch - 'a'; // Get index for weight array
                int charWeight = weights[alphabeticIndex];

                // Apply special rule for the first and last characters
                if (i == 0 || i == word.length() - 1) {
                    if (charWeight < 0) {
                        charWeight += (alphabeticIndex + 1); // Add alphabetic position
                    }
                }
                wordWeight += charWeight;
            }

            // Multiply the weight of the word to the total weight
            totalWeight *= wordWeight;
        }
        return totalWeight;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] weights1 = {12, 11, 6, 1, -1, 23, 12, 1, 28, -43, 6, 98, 11, 2, 7, 88, 9, -4, -54, 25, 19, -12, -32, 65, 3, -9};
        String input1 = "Spring AND Hibernate";
        int result1 = getStringWeight(weights1, input1);
        System.out.println("Weight of the string 'Spring AND Hibernate': " + result1);

        // Test Case 2
        int[] weights2 = {15, 16, 1, -2, -13, 61, 11, 4, 3, 19, -4, 17, -3, 90, -65, 67, 12, 0, 13, 2, 3, 43, 21, -17, 2, 42};
        String input2 = "Wipro Limited";
        int result2 = getStringWeight(weights2, input2);
        System.out.println("Weight of the string 'Wipro Limited': " + result2);
    }
}