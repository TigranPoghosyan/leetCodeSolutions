package leetCodeSolutions.easyProblems.maximumDepthOfNaryTree559;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
        this.children = new ArrayList<>(); // Initialize the children list
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", children=" + children +
                '}';
    }
}




