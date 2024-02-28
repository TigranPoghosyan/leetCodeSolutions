package leetCodeSolutions.easyProblems.intersectionOfTwoLinkedLists160;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode headA = new ListNode(4, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5)))));
        ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))));
        ListNode intersectionNode = solution.getIntersectionNode(headA, headB);
        System.out.println(intersectionNode);
    }
}
