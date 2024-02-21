package leetCodeSolutions.mediumProblems.flattenBinaryTreeToLinkedList114;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode leftThree = new TreeNode(3);
        TreeNode rightFour = new TreeNode(4);
        TreeNode rightSix = new TreeNode(6);
        TreeNode leftTwo = new TreeNode(2, leftThree, rightFour);
        TreeNode rightFive = new TreeNode(5, null, rightSix);
        TreeNode root = new TreeNode(1, leftTwo, rightFive);

        solution.flatten(root);
        System.out.println(root);
    }
}
