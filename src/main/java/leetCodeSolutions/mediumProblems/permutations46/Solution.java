package leetCodeSolutions.mediumProblems.permutations46;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(result, list, nums);
        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
        } else {
            for (int num : nums) {
                if (list.contains(num)) {
                    continue; // element already exists, skip
                }
                list.add(num);
                backtrack(result, list, nums);
                list.remove(list.size() - 1);
            }
        }
    }
}
