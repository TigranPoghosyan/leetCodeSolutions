package leetCodeSolutions.palindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = 0;
        int copy = x;
        while (copy > 0) {
            int digit = copy % 10;
            reversed = (reversed * 10) + digit;
            copy = copy / 10;
        }
        return reversed == x;
    }
}
