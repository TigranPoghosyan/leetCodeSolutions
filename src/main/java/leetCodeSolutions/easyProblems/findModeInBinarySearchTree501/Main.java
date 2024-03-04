package leetCodeSolutions.easyProblems.findModeInBinarySearchTree501;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        int[] result = solution.findMode(root);
        System.out.println(result);
    }
}
