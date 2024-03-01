package leetCodeSolutions.easyProblems.minimumAbsoluteDifference1200;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {4, 2, 1, 3};
        List<List<Integer>> result = solution.minimumAbsDifference(arr);
        System.out.println(result);
    }
}
