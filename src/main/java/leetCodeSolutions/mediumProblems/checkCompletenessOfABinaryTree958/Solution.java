package leetCodeSolutions.mediumProblems.checkCompletenessOfABinaryTree958;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isCompleteTree(TreeNode root){
        boolean end = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            if (current == null){
                end = true;
            }else {
                if (end){
                    return false;
                }
                queue.offer(current.left);
                queue.offer(current.right);
            }
        }
        return true;
    }
}
