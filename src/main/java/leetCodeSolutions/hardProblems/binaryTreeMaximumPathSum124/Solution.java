package leetCodeSolutions.hardProblems.binaryTreeMaximumPathSum124;

public class Solution {
    int maxPathSum;

    public int maxPathSum(TreeNode root) {
        maxPathSum = Integer.MIN_VALUE;
        pathSum(root);
        return maxPathSum;
    }

    public int pathSum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = Math.max(0, pathSum(node.left));
        int right = Math.max(0, pathSum(node.right));
        maxPathSum = Math.max(maxPathSum, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
