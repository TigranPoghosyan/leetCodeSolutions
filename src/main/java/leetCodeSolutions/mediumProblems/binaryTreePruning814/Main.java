package leetCodeSolutions.mediumProblems.binaryTreePruning814;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create the nodes
        TreeNode node1 = new TreeNode(1);
        TreeNode nodeNull1 = null; // No node for null value
        TreeNode node0_1 = new TreeNode(0);
        TreeNode node0_2 = new TreeNode(0);
        TreeNode node1_2 = new TreeNode(1);

        // Connect the nodes to form the tree structure
        node1.left = nodeNull1; // No left child for the root node
        node1.right = node0_1;
        node0_1.left = node0_2;
        node0_1.right = node1_2;
        // No need to link nodes for null children

        // Set the root node
        TreeNode root = node1;

        TreeNode result = solution.pruneTree(root);
        System.out.println(result);
    }
}
