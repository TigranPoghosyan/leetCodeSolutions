package leetCodeSolutions.mediumProblems.sortList148;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        ListNode result = solution.sortList(head);
        System.out.println(result);
    }
}
