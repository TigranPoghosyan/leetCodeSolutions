package leetCodeSolutions.mediumProblems.binaryTreePruning814;

public class Solution {
    public TreeNode pruneTree(TreeNode root) {
        return checkOrder(root) ? root : null;
    }
    public boolean checkOrder(TreeNode node){
        if(node == null){
            return false;
        }
        boolean left = checkOrder(node.left);
        boolean right = checkOrder(node.right);

        if(!left){
            node.left = null;
        }
        if(!right){
            node.right = null;
        }
        return node.val == 1 || right || left;
    }
}
