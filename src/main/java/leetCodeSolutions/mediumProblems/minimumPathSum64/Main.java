package leetCodeSolutions.mediumProblems.minimumPathSum64;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int result = solution.minPathSum(nums);
        System.out.println(result);
    }
}
