package leetCodeSolutions.mediumProblems.permutationsTwo47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findAllPermutations(result, nums, 0);
        return result;
    }

    private void findAllPermutations(List<List<Integer>> result, int[] nums, int index) {
        if (index == nums.length - 1) {
            List<Integer> current = new ArrayList<>();
            for (int val : nums) {
                current.add(val);
            }
            result.add(current);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if (set.add(nums[i])) {
                swap(nums, i, index);
                findAllPermutations(result, nums, index + 1);
                swap(nums, i, index);
            }
        }
    }

    public void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
