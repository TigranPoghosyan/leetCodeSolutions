package leetCodeSolutions.mediumProblems.threeSumClosest16;

import java.util.Arrays;

public class Solution {
    public int threeSumCloses(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int currentSum = nums[i] + nums[start] + nums[end];

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                if (currentSum < target) {
                    start++;
                } else if (currentSum > target) {
                    end--;
                } else {
                    return target;
                }
            }
        }
        return closestSum;
    }
}
