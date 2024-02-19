package leetCodeSolutions.easyProblems.symmetricTree101;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode node6 = new TreeNode(6);
        TreeNode node3 = new TreeNode(3, node6, node6);
        TreeNode node2 = new TreeNode(2, node3, node3);
        TreeNode root = new TreeNode(1, node2, node2);

        boolean result = solution.isSymmetric(root);
        System.out.println(result);
    }
}


