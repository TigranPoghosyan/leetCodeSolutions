package leetCodeSolutions.easyProblems.binaryTreePaths257;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        List<String> result = solution.binaryTreePaths(root);
        System.out.println(result);
    }
}
