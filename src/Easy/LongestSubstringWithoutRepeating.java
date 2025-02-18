package Easy;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        // HashSet to store characters in the current window
        HashSet<Character> charSet = new HashSet<>();
        int left = 0, maxLength = 0;

        // Sliding window with right pointer
        for (int right = 0; right < s.length(); right++) {
            // Shrink window if the character is already in the set
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            // Add current character to the set
            charSet.add(s.charAt(right));
            // Update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static int lengthOfLongestSubstringHasmap(String s) {
        // HashSet to store characters in the current window
        HashSet<Character> charSet = new HashSet<>();
        int left = 0, maxLength = 0;

        // Sliding window with right pointer
        for (int right = 0; right < s.length(); right++) {
            // Shrink window if the character is already in the set
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            // Add current character to the set
            charSet.add(s.charAt(right));
            // Update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Output: 3
//        System.out.println(lengthOfLongestSubstring("bbbbb"));    // Output: 1
//        System.out.println(lengthOfLongestSubstring("pwwkew"));   // Output: 3
//        System.out.println(lengthOfLongestSubstring(""));         // Output: 0
    }
}