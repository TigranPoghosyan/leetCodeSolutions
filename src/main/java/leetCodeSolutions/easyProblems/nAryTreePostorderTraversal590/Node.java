package leetCodeSolutions.easyProblems.nAryTreePostorderTraversal590;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public List<Node> children;

    public Node() {
        this.children = new ArrayList<>(); // Initialize children list
    }

    public Node(int val) {
        this.val = val;
        this.children = new ArrayList<>(); // Initialize children list
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children != null ? children : new ArrayList<>(); // Initialize children list
    }
}
