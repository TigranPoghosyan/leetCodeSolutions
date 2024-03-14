package leetCodeSolutions.mediumProblems.combinationSum39;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidates = {2, 3, 6, 7};
        List<List<Integer>> result = solution.combinationSum(candidates, 7);
        System.out.println(result);
    }
}
