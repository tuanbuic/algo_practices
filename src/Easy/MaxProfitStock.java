package Easy;

public class MaxProfitStock {
    static int maxLen = 0;
    static int lowest = 0;

    public static void main(String args[]) {

        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        char[] input = s.toCharArray();
        for (int i = 0; i <= input.length; i++) {
            expandPandlinrome(input, i, i);
            expandPandlinrome(input, i, i + 1);
        }
        return s.substring(lowest, maxLen+lowest);
    }

    public static void expandPandlinrome(char[] s, int l, int r) {
        while (r < s.length && l >= 0 && s[l] == s[r]) {
            l--;
            r++;
        }
        if (maxLen < r - l - 1) {
            maxLen = r - l - 1;
            lowest = l + 1;
        }
    }
}
