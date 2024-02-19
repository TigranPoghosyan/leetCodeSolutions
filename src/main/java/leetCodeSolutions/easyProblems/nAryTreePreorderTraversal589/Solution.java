package leetCodeSolutions.easyProblems.nAryTreePreorderTraversal589;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preOrder(Node root) {
        List<Integer> result = new ArrayList<>();
        recursiveCall(root, result);
        return result;
    }

    public void recursiveCall(Node root, List<Integer> result) {
        result.add(root.val);
        for(Node child: root.children){
            recursiveCall(child,result);
        }
    }
}

//Another one solution
//  LinkedList<Node> stack = new LinkedList();
//         LinkedList<Integer> output = new LinkedList();
//         if(root == null) return output;
//         stack.add(root);

//         while(!stack.isEmpty()){
//             Node node = stack.pollLast();
//             output.add(node.val);
//             Collections.reverse(node.children);

//             for(Node child:node.children){
//                 stack.add(child);
//             }
//         }
//         return output;
