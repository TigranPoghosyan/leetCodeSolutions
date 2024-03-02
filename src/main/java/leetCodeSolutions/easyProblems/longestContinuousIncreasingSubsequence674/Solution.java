package leetCodeSolutions.easyProblems.longestContinuousIncreasingSubsequence674;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int currentMax = 1;

        for (int i = 1; i < nums.length; i++) {
            currentMax = nums[i] > nums[i - 1] ? currentMax + 1 : 1;
            max = Math.max(max, currentMax);
        }
        return max;
    }
}
