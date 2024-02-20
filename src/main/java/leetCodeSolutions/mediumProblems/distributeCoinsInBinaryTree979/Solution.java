package leetCodeSolutions.mediumProblems.distributeCoinsInBinaryTree979;

public class Solution {
    int numMoves;
    public int distributeCoins(TreeNode root){
        numMoves = 0;
        giveCoins(root);
        return numMoves;
    }
    public int giveCoins(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = giveCoins(node.left);
        int right = giveCoins(node.right);
        numMoves += Math.abs(left) + Math.abs(right);
        return node.val + left + right - 1;
    }
}
