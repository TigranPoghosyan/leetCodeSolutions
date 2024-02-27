package leetCodeSolutions.easyProblems.smallestRangeOne908;

public class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int minVal = nums[0];
        int maxVal = nums[0];

        for (int num : nums) {
            minVal = Math.min(num, minVal);
            maxVal = Math.max(num, maxVal);
        }
        if (minVal + k >= maxVal - k) {
            return 0;
        } else {
            return (maxVal - k) - (minVal + k);
        }
    }
}
