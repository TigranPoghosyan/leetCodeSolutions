package leetCodeSolutions.mediumProblems.combinationSumTwo40;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int[] counts = new int[51];
        for (int num : candidates) {
            counts[num]++;
        }
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        findAll(counts, current, 1, target, result);
        return result;
    }

    private void findAll(int[] counts, List<Integer> current, int i, int target, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int j = i; j < counts.length; j++) {
            if (j <= target && counts[j] > 0) {
                counts[j]--;
                current.add(j);
                findAll(counts, current, j, target - j, result);
                current.remove(current.size() - 1);
                counts[j]++;
            } else if (j > target) {
                return;
            }
        }
    }
}