package leetCodeSolutions.mediumProblems.nextGreaterNodeInLinkedList1019;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(2, new ListNode(1, new ListNode(5)));
        int[] result = solution.nextLargerNodes(listNode);
        System.out.println(Arrays.toString(result));
    }
}
