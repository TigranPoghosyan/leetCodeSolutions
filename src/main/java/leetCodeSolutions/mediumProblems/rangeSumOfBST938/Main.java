package leetCodeSolutions.mediumProblems.rangeSumOfBST938;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Creating the nodes
        TreeNode three = new TreeNode(3);
        TreeNode seven = new TreeNode(7);
        TreeNode five = new TreeNode(5, three, seven);

        TreeNode eighteen = new TreeNode(18);
        TreeNode fifteen = new TreeNode(15, null, eighteen);

        TreeNode root = new TreeNode(10, five, fifteen);
        int result = solution.rangeSumBST(root,7,15);
        System.out.println(result);
    }
}
