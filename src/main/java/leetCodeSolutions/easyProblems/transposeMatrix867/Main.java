package leetCodeSolutions.easyProblems.transposeMatrix867;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = solution.transpose(nums);
        System.out.println(Arrays.deepToString(result));
    }
}
