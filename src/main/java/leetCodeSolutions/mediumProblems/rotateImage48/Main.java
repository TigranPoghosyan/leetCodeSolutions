package leetCodeSolutions.mediumProblems.rotateImage48;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        solution.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
