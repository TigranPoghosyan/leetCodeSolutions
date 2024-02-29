package leetCodeSolutions.hardProblems.binaryTreeMaximumPathSum124;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode left = new TreeNode(15);
        TreeNode right = new TreeNode(7);
        TreeNode rootLeft = new TreeNode(9);
        TreeNode rootRight = new TreeNode(20, left, right);
        TreeNode root = new TreeNode(-10, rootLeft, rootRight);
        int result = solution.maxPathSum(root);
        System.out.println(result);
    }
}
