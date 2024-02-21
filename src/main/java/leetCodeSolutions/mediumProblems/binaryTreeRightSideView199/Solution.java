package leetCodeSolutions.mediumProblems.binaryTreeRightSideView199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return result;
        }
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if(i == 0){
                    result.add(current.val);
                }
                if(current.right != null){
                    queue.offer(current.right);
                }
                if(current.left != null){
                    queue.offer(current.left);
                }
            }
        }
        return result;
    }
}
