package leetCodeSolutions.easyProblems.sumOfLeftLeaves404;

import java.util.Stack;

public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if (current.left != null) {
                if (current.left.left == null && current.left.right == null) {
                    sum += current.left.val;
                } else {
                    stack.push(current.left);
                }
            }
            if (current.right != null) {
                if (current.right.left != null || current.right.right != null) {
                    stack.push(current.right);
                }
            }
        }
        return sum;
    }
}
