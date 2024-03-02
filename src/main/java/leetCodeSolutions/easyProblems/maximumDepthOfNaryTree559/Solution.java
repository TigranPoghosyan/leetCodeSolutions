package leetCodeSolutions.easyProblems.maximumDepthOfNaryTree559;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int depth = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i<size;i++){
                Node currentNode = queue.poll();
                for(Node child:currentNode.children){
                    queue.offer(child);
                }
            }
            depth++;
        }
        return depth;
    }
}
