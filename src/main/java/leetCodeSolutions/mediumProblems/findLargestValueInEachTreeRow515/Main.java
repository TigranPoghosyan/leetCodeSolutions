package leetCodeSolutions.mediumProblems.findLargestValueInEachTreeRow515;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Create the nodes
        TreeNode node1 = new TreeNode(1);
        TreeNode node3_1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node5 = new TreeNode(5);
        TreeNode node3_2 = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);

        // Connect the nodes to form the tree structure
        node1.left = node3_1;
        node1.right = node2;
        node3_1.left = node5;
        node3_1.right = node3_2;
        node2.right = node9;

        // Set the root node
        TreeNode root = node1;

        List<Integer> result = solution.largestValues(root);
        System.out.println(result);
    }
}
