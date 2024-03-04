package leetCodeSolutions.easyProblems.binaryTreePaths257;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        String currentPath = Integer.toString(root.val);
        if (root.left == null && root.right == null) {
            result.add(currentPath);
        }
        if (root.left != null) {
            dfs(root.left, currentPath, result);
        }
        if (root.right != null) {
            dfs(root.right, currentPath, result);
        }
        return result;
    }

    public void dfs(TreeNode node, String currentPath, List<String> result) {
        currentPath += "->" + node.val;
        if (node.left == null && node.right == null) {
            result.add(currentPath);
            return;
        }
        if (node.left != null) {
            dfs(node.left, currentPath, result);
        }
        if (node.right != null) {
            dfs(node.right, currentPath, result);
        }
    }
}

// First Solution
//public List<String> binaryTreePaths(TreeNode root) {
//    List<String> sList=new LinkedList<String>();
//    if (root==null) return sList;
//    if (root.left==null && root.right==null) {
//        sList.add(Integer.toString(root.val));
//        return sList;
//    }
//
//    for (String s: binaryTreePaths(root.left)) {
//        sList.add(Integer.toString(root.val)+"->"+s);
//    }
//    for (String s: binaryTreePaths(root.right)) {
//        sList.add(Integer.toString(root.val)+"->"+s);
//    }
//    return sList;
//}
