package leetCodeSolutions.mediumProblems.nextGreaterNodeInLinkedList1019;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> nodeVals = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            nodeVals.add(current.val);
            current = current.next;
        }

        int[] result = new int[nodeVals.size()];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nodeVals.size(); i++) {
            while (!stack.isEmpty() && nodeVals.get(stack.peek()) < nodeVals.get(i)) {
                result[stack.pop()] = nodeVals.get(i);
            }
            stack.push(i);
        }

        return result;
    }
}
