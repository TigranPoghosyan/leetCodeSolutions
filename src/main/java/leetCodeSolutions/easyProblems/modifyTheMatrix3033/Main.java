package leetCodeSolutions.easyProblems.modifyTheMatrix3033;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1,2,-1},{4,-1,6},{7,8,9}};
        int[][] result = solution.modifiedMatrix(matrix);
        System.out.println(Arrays.deepToString(result));
    }
}
