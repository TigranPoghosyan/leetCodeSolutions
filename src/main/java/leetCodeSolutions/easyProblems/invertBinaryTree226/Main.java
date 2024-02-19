package leetCodeSolutions.easyProblems.invertBinaryTree226;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode nine = new TreeNode(9);
        TreeNode eight = new TreeNode(8);
        TreeNode three = new TreeNode(3);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2,one,three);
        TreeNode seven = new TreeNode(7,eight,nine);
        TreeNode root = new TreeNode(4, two, seven);

        TreeNode result = solution.invertTree(root);
        System.out.println(result);

    }
}
