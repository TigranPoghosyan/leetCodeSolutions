package leetCodeSolutions.mediumProblems.wordSearch79;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        String word2 = "ABCCPED";
        boolean exist = solution.exist(board, word);
        boolean exist2 = solution.exist(board, word2);
        System.out.println(exist);
        System.out.println(exist2);
    }
}
