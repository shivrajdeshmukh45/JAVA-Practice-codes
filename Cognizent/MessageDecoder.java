public class MessageDecoder {

    public static String decodeMessage(String input1, int input2, int input3) {
        StringBuilder decodedMessage = new StringBuilder();
        for (int i = 0; i < input1.length(); i++) {
            char charAtI = input1.charAt(i);
            if ((i + 1) % 2 != 0) { // Odd index (1-based)
                char decodedChar = (char) (((charAtI - 'a' + input2) % 26) + 'a');
                decodedMessage.append(decodedChar);
            } else { // Even index (1-based)
                char decodedChar = (char) (((charAtI - 'a' - input3 + 26) % 26) + 'a');
                decodedMessage.append(decodedChar);
            }
        }
        return decodedMessage.toString();
    }

    public static void main(String[] args) {
        // Example 1
        String input1_1 = "abcdef";
        int input2_1 = 2;
        int input3_1 = 1;
        String output1 = decodeMessage(input1_1, input2_1, input3_1);
        System.out.println(output1); // Output: caecge

        // Example 2
        String input1_2 = "xyz";
        int input2_2 = 3;
        int input3_2 = 2;
        String output2 = decodeMessage(input1_2, input2_2, input3_2);
        System.out.println(output2); // Output: awe
    }
}



