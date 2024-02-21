package leetCodeSolutions.mediumProblems.spiralMatrix54;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = solution.spiralOrder(matrix);
        System.out.println(result);
    }
}
