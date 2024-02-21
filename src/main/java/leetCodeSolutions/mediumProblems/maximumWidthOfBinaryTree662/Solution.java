package leetCodeSolutions.mediumProblems.maximumWidthOfBinaryTree662;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;

        int answer=0;

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root,0));

        while(queue.size()>0){
            int size=queue.size();
            int left=queue.peek().index;
            int right=queue.peek().index;

            while(size-- > 0){
                Pair temp=queue.poll();
                right=temp.index;

                if(temp.root.left!=null){
                    queue.add(new Pair(temp.root.left,temp.index*2+1));
                }
                if(temp.root.right!=null) {
                    queue.add(new Pair(temp.root.right,temp.index*2+2));
                }
            }
            answer=Math.max(answer,right-left+1);
        }
        return answer;
    }
}