package leetCodeSolutions.mediumProblems.checkCompletenessOfABinaryTree958;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode leftFour = new TreeNode(4);
        TreeNode rightFive = new TreeNode(5);
        TreeNode leftSix = new TreeNode(6);
        TreeNode leftTwo = new TreeNode(2, leftFour, rightFive);
        TreeNode rightThree = new TreeNode(3, leftSix, null);
        TreeNode root = new TreeNode(1, leftTwo, rightThree);

        boolean completeTree = solution.isCompleteTree(root);
        System.out.println(completeTree);
    }
}
