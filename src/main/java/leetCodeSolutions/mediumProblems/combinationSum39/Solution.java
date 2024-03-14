package leetCodeSolutions.mediumProblems.combinationSum39;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findAllCandidates(candidates, finalList, list, 0, target);

        return finalList;
    }

    private void findAllCandidates(int[] candidates, List<List<Integer>> finalList, List<Integer> list, int i, int target) {
        if (target == 0) {
            finalList.add(new ArrayList<>(list));
        }
        for (int j = i; j < candidates.length; j++) {
            if (candidates[j] <= target) {
                list.add(candidates[j]);
                findAllCandidates(candidates, finalList, list, j, target - candidates[j]);
                list.remove(list.size() - 1);
            }
        }
    }
}
