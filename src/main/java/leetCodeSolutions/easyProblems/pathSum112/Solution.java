package leetCodeSolutions.easyProblems.pathSum112;

import java.util.Stack;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> sum = new Stack<>();

        stack.add(root);
        sum.add(targetSum - root.val);

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            int currentSum = sum.pop();

            if (currentNode.left == null && currentNode.right == null && currentSum == 0) {
                return true;
            }
            if (currentNode.left != null) {
                stack.add(currentNode.left);
                sum.add(currentSum - currentNode.left.val);
            }
            if (currentNode.right != null) {
                stack.add(currentNode.right);
                sum.add(currentSum - currentNode.right.val);
            }
        }
        return false;
    }
}
