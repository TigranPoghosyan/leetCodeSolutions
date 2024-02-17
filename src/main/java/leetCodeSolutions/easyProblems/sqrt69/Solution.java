package leetCodeSolutions.easyProblems.sqrt69;

public class Solution {
    public int mySqrt(int x) {
        long left = 0;
        long right = (x / 2) + 1;
        while (left < right) {
            long mid = left + (right - left) / 2 + 1;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square > x) {
                right = mid - 1;
            } else if (square < x) {
                left = mid;
            }
        }
        return (int) left;
    }
}
