package leetCodeSolutions.easyProblems.validPalindromeTwo680;

public class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return helper(s, start + 1, end) || helper(s, start, end - 1);
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean helper(String s, int i, int j) {
        int start = i;
        int end = j;

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
