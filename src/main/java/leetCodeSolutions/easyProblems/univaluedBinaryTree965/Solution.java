package leetCodeSolutions.easyProblems.univaluedBinaryTree965;

public class Solution {
    public boolean isUnivalTree(TreeNode root){
        boolean leftSide = root.left == null || root.left.val == root.val && isUnivalTree(root.left);
        boolean rightSide = root.right == null || root.right.val == root.val && isUnivalTree(root.right);
        return leftSide && rightSide;
    }
}
