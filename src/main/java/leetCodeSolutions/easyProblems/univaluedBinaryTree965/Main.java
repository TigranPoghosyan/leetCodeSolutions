package leetCodeSolutions.easyProblems.univaluedBinaryTree965;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Creating the nodes
        TreeNode one1 = new TreeNode(1);
        TreeNode one2 = new TreeNode(1);
        TreeNode one3 = new TreeNode(1);
        TreeNode one4 = new TreeNode(1);
        TreeNode one5 = new TreeNode(1);
        TreeNode one6 = new TreeNode(1);
        TreeNode one7 = new TreeNode(1);

        // Constructing the tree structure
        one1.left = one2;
        one1.right = one3;
        one2.left = one4;
        one2.right = one5;
        one3.left = null;
        one3.right = one6;
        one5.left = null;
        one5.right = one7;
        boolean univalTree = solution.isUnivalTree(one1);
        System.out.println(univalTree);
    }
}
