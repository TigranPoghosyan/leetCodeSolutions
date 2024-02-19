package leetCodeSolutions.easyProblems.nAryTreePostorderTraversal590;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> postOrder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        stack.add(root);

        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            result.addFirst(node.val);
            for (Node child : node.children) {
                stack.add(child);
            }
        }
        return result;
    }
}
