package leetCodeSolutions.mediumProblems.surroundedRegions130;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        solution.solve(board);
        System.out.println(board);
    }
}
