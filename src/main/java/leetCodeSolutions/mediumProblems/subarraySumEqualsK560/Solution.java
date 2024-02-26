package leetCodeSolutions.mediumProblems.subarraySumEqualsK560;

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i <= nums.length - 1; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                result += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}
