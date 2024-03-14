package leetCodeSolutions.mediumProblems.combinationSumTwo40;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> result = solution.combinationSum2(candidates, 8);
        System.out.println(result);
    }
}
