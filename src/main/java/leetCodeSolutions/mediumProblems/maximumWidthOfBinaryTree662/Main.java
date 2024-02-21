package leetCodeSolutions.mediumProblems.maximumWidthOfBinaryTree662;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode rightNine = new TreeNode(9);
        TreeNode leftFive = new TreeNode(5);
        TreeNode rightThree = new TreeNode(3);
        TreeNode rootRight = new TreeNode(2,null,rightNine);
        TreeNode rootLeft = new TreeNode(3,leftFive,rightThree);
        TreeNode root = new TreeNode(1,rootLeft,rootRight);

        int result = solution.widthOfBinaryTree(root);
        System.out.println(result);
    }
}
