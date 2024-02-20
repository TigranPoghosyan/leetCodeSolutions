package leetCodeSolutions.mediumProblems.rangeSumOfBST938;

import java.util.Stack;

public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int count = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if (current != null) {
                if (current.val <= high && current.val >= low) {
                    count += current.val;
                }
                if (current.val > low) {
                    stack.push(current.left);
                }
                if (current.val < high) {
                    stack.push(current.right);
                }
            }
        }
        return count;
    }
}
