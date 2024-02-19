package leetCodeSolutions.easyProblems.binaryTreeInorderTraversal94;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode node6 = new TreeNode(6);
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3, null, node6);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode root = new TreeNode(1, node2, node3);

        List<Integer> result = solution.inorderTraversal(root);
        System.out.println(result);
    }
}
