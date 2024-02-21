package leetCodeSolutions.easyProblems.sumOfLeftLeaves404;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode rightSeven = new TreeNode(7);
        TreeNode leftFifteen = new TreeNode(15);
        TreeNode rightTwenty = new TreeNode(20, leftFifteen, rightSeven);
        TreeNode leftNine = new TreeNode(9);
        TreeNode root = new TreeNode(3, leftNine, rightTwenty);
        int result = solution.sumOfLeftLeaves(root);
        System.out.println(result);
    }
}
