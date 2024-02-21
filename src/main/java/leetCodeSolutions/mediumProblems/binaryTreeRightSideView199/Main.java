package leetCodeSolutions.mediumProblems.binaryTreeRightSideView199;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode rightFour = new TreeNode(4);
        TreeNode rightFive = new TreeNode(5);
        TreeNode rightThree = new TreeNode(3,null,rightFour);
        TreeNode leftTwo = new TreeNode(2,null,rightFive);
        TreeNode root = new TreeNode(1,leftTwo,rightThree);

        List<Integer> result = solution.rightSideView(root);
        System.out.println(result);
    }
}
