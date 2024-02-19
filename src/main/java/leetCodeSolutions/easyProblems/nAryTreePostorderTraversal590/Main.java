package leetCodeSolutions.easyProblems.nAryTreePostorderTraversal590;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Creating the nodes
        Node node6 = new Node(6);
        Node node5 = new Node(5);
        Node node4 = new Node(4);
        Node node3 = new Node(3, List.of(node5, node6));
        Node node2 = new Node(2);
        Node root = new Node(1, List.of(node3, node2, node4));

        List<Integer> result = solution.postOrder(root);
        System.out.println(result);
    }
}
