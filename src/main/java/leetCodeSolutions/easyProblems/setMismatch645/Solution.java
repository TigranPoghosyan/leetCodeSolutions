package leetCodeSolutions.easyProblems.setMismatch645;

import java.util.HashSet;

public class Solution {
    public int[] findErrorNums(int[] nums) {

        int dup = 0, miss = 0;
        HashSet<Integer> set = new HashSet<>();

        // find duplicate using set
        for (int num : nums) {
            if (set.contains(num)) {
                dup = num;
            }
            set.add(num);
        }

        // find missing
        for (int i = 1; i <= nums.length; ++i) {
            if (!set.contains(i)) {
                miss = i;
                break;
            }
        }

        return new int[]{dup, miss};
    }
}
