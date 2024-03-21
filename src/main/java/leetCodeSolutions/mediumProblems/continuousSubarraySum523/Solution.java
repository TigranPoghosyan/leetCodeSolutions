package leetCodeSolutions.mediumProblems.continuousSubarraySum523;

public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0 && nums[i - 1] == 0) {
                return true;
            }
            int[] prefix = new int[nums.length];
            prefix[0] = nums[0];
            for (int right = 1; right < nums.length; right++) {
                prefix[right] = prefix[right - 1] + nums[right];
                if (prefix[right] % k == 0) {
                    return true;
                }
                int left = right - 2;

                while ((left >= 0) && (prefix[right] - prefix[left] >= k)) {
                    if (((prefix[right] - prefix[left]) & k) == 0) {
                        return true;
                    }
                    left--;
                }
            }
        }
        return false;
    }
}
