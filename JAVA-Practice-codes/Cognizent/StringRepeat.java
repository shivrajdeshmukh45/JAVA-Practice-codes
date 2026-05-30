// Given a string s, find the length of the longest 
// substring
//  without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
package Cognizent;

import java.util.HashSet;

public class StringRepeat {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set= new HashSet<Character>();

        int left=0,maxLength=0;

        for(int right=0;right<s.length();right++){
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength=Math.max(maxLength, right-left+1);

        }
        return maxLength;



    }
    public static void main(String[] args) {
        StringRepeat solution = new StringRepeat();
        String s = "bbbbb";
        System.out.println(solution.lengthOfLongestSubstring(s));  // Output: 3
    }

    
}
