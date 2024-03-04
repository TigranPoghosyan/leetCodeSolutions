package leetCodeSolutions.mediumProblems.constructBinaryTreeFromPreorderAndInorderTraversal105;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode treeNode = solution.buildTree(preorder, inorder);
        System.out.println(treeNode);
    }
}
