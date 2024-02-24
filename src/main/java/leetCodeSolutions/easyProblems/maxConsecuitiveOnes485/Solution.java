package leetCodeSolutions.easyProblems.maxConsecuitiveOnes485;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int current = 0;
        int maxCount = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num == 1) {
                current++;
                maxCount = Math.max(maxCount, current);
            } else {
                current = 0;
            }
        }
        return maxCount != Integer.MIN_VALUE ? maxCount : 0;
    }
}
