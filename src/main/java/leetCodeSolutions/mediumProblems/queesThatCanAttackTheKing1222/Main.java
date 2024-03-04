package leetCodeSolutions.mediumProblems.queesThatCanAttackTheKing1222;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] queens = {{0, 1}, {1, 0}, {4, 0}, {0, 4}, {3, 3}, {2, 4}};
        int[] king = {0, 0};
        List<List<Integer>> result = solution.queensAttacktheKing(queens, king);
        System.out.println(result);
    }
}
