package leetCodeSolutions.easyProblems.mergeTwoSortedList21;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode l2 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode result = solution.mergeTwoLists(l1, l2);
        System.out.println(result);
    }
}
