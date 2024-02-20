package leetCodeSolutions.mediumProblems.findLargestValueInEachTreeRow515;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList();
        helper(root,result,0);
        return result;
    }
    public void helper(TreeNode root,List<Integer> result,int level){
        if(root == null){
            return;
        }
        if(level == result.size()){
            result.add(root.val);
        }else{
            result.set(level,Math.max(result.get(level),root.val));
        }
        helper(root.left,result,level+1);
        helper(root.right,result,level+1);
    }
}
