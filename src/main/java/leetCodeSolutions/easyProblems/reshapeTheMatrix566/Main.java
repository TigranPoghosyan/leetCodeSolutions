package leetCodeSolutions.easyProblems.reshapeTheMatrix566;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{1, 2}, {3, 4}};
        int[][] result = solution.matrixReshape(nums, 1, 4);
        System.out.println(Arrays.deepToString(result));
    }
}
