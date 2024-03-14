package leetCodeSolutions.mediumProblems.permutationsTwo47;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2};
        List<List<Integer>> result = solution.permuteUnique(nums);
        System.out.println(result);
    }
}
