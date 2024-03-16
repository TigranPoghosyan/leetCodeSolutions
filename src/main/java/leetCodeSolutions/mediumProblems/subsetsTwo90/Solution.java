package leetCodeSolutions.mediumProblems.subsetsTwo90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
//        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        findAllSubsets(0, nums, result, current);
        return result;
    }

    public void findAllSubsets(int index, int[] nums, List<List<Integer>> result, List<Integer> current) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i - 1]) {
                continue;//skip the duplicates, except for the first time
            }
            current.add(nums[i]); //include
            findAllSubsets(i + 1, nums, result, current); //explore
            current.remove(current.size() - 1);//backtrack, remove the element
        }
    }
}