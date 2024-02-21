package leetCodeSolutions.easyProblems.searchInABinarySearchTree700;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode leftOne = new TreeNode(1);
        TreeNode rightThree = new TreeNode(3);
        TreeNode rightSeven = new TreeNode(7);
        TreeNode leftTwo = new TreeNode(2, leftOne, rightThree);
        TreeNode root = new TreeNode(4, leftTwo, rightSeven);
        TreeNode result = solution.searchBST(root, 2);
        System.out.println(result);
    }
}
