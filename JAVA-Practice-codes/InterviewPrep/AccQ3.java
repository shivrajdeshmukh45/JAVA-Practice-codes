package InterviewPrep;

public class AccQ3 {

    static int ascciSum(String s){
        int sum=0;

        for(char c:s.toCharArray()){
            sum+=(int)c;
        }
        System.out.println(sum);
        return sum;
    }

    static int lagestCommonSubstring(String str1,String str2){

        int maxLength = 0;
        String longestCommonSubstring = "";

        // Generate all substrings of str1
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                String substring = str1.substring(i, j);

                // Check if this substring is in str2
                if (str2.contains(substring)) {
                    // Update longestCommonSubstring if this one is longer
                    if (substring.length() > maxLength) {
                        maxLength = substring.length();
                        longestCommonSubstring = substring;
                    }
                }
            }

           
        }
     if (maxLength==0){
        return 0;
     }
     return ascciSum(longestCommonSubstring);
    }


    public static void main(String[] args) {
        
        String str1="adventure";
        String str2="future";

        int val=lagestCommonSubstring(str1,str2);
        System.out.println(val);
    }
    
}
