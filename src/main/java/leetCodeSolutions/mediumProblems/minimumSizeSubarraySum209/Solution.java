package leetCodeSolutions.mediumProblems.minimumSizeSubarraySum209;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int currentSum = 0;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            while (currentSum >= target) {
                result = Math.min(result, i + 1 - left);
                currentSum -= nums[i];
                left++;
            }
        }
        return (result != Integer.MAX_VALUE) ? result : 0;
    }
}
