package leetCodeSolutions.mediumProblems.findBottomLeftTreeValue513;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Creating the nodes
        TreeNode one = new TreeNode(1);
        TreeNode three = new TreeNode(3);
        TreeNode root = new TreeNode(2);

        // Constructing the tree structure
        root.left = one;
        root.right = three;

        int bottomLeftValue = solution.findBottomLeftValue(root);
        System.out.println(bottomLeftValue);
    }
}
