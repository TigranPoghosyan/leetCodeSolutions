package leetCodeSolutions.mediumProblems.reverseLinkedListTwo92;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode result = solution.reverseBetween(listNode, 2, 4);
        System.out.println(result);
    }
}
