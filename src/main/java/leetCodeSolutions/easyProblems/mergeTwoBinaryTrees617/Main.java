package leetCodeSolutions.easyProblems.mergeTwoBinaryTrees617;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Create root1: [1,3,2,5]
        TreeNode five = new TreeNode(5);
        TreeNode three = new TreeNode(3, five, null);
        TreeNode right = new TreeNode(2);
        TreeNode root1 = new TreeNode(1, three, right);

        // Create root2: [2,1,3,null,4,null,7]
        TreeNode four = new TreeNode(4);
        TreeNode seven = new TreeNode(7);
        TreeNode three2 = new TreeNode(3, null, seven);
        TreeNode one = new TreeNode(1, null, four);
        TreeNode root2 = new TreeNode(2, one, three2);

        TreeNode result = solution.mergeTrees(root1, root2);
        System.out.println(result);
    }
}
