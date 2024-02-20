package leetCodeSolutions.easyProblems.reverseString344;

public class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char val = 0;
            val = s[start];
            s[start] = s[end];
            s[end] = val;
            start++;
            end--;
        }
    }
}
