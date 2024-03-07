package leetCodeSolutions.easyProblems.toeplitzMatrix766;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        boolean toeplitzMatrix = solution.isToeplitzMatrix(matrix);
        System.out.println(toeplitzMatrix);
    }
}
