package leetCodeSolutions.mediumProblems.kthSmallestElementInASortedMatrix378;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int result = solution.kthSmallest(matrix, 8);
        System.out.println(result);
    }
}
