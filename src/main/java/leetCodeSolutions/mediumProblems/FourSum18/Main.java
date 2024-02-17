package leetCodeSolutions.mediumProblems.FourSum18;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,0,-1,0,-2,2};
        List<List<Integer>> result = solution.fourSum(nums, 0);
        System.out.println(result);
    }
}
