package leetCodeSolutions.mediumProblems.distributeCoinsInBinaryTree979;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Creating the nodes
        TreeNode three = new TreeNode(3);
        TreeNode zero1 = new TreeNode(0);
        TreeNode zero2 = new TreeNode(0);

        // Constructing the tree structure
        three.left = zero1;
        three.right = zero2;

        // Printing the root node
        TreeNode root = three;
        int result = solution.distributeCoins(root);
        System.out.println(result);
    }
}
