package leetCodeSolutions.easyProblems.matrixSimilarityAfterCyclicShifts2946;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] mat = {{1, 2, 1, 2}, {5, 5, 5, 5}, {6, 3, 6, 3}};
        boolean result = solution.areSimilar(mat, 2);
        System.out.println(result);
    }
}
