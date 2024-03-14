package leetCodeSolutions.mediumProblems.permutations46;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        computePermutation(0, nums, result);
        return result;
    }

    private void computePermutation(int index, int[] nums, List<List<Integer>> result) {
        if (index >= nums.length) {
            List<Integer> list = new ArrayList<>();
            for (Integer num : nums) {
                list.add(num);
            }
            result.add(list);
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            computePermutation(index + 1, nums, result);
            swap(nums, i, index);
        }
    }

    public void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}


// SECOND SOLUTION

//public class Solution {
//    public List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        backtrack(result, list, nums);
//        return result;
//    }
//
//    public void backtrack(List<List<Integer>> result, List<Integer> list, int[] nums) {
//        if (list.size() == nums.length) {
//            result.add(new ArrayList<>(list));
//        } else {
//            for (int num : nums) {
//                if (list.contains(num)) {
//                    continue; // element already exists, skip
//                }
//                list.add(num);
//                backtrack(result, list, nums);
//                list.remove(list.size() - 1);
//            }
//        }
//    }
//}
