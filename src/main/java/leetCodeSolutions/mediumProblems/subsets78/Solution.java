package leetCodeSolutions.mediumProblems.subsets78;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> current = new ArrayList<>();
//        if (nums == null || nums.length == 0){
//            return result;
//        }
//        subsetsCall(nums, result, current, 0);
//        return result;
    }

    private void subsetsCall(int[] nums, List<List<Integer>> result, List<Integer> current, int index) {
        if (index >= nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[index]);
        subsetsCall(nums, result, current, index + 1);
        current.remove(current.size() - 1);
        subsetsCall(nums, result, current, index + 1);
    }
}
