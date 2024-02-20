package leetCodeSolutions.easyProblems.middleOfLinkedList876;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode result = solution.middleNode(listNode);
        System.out.println(result);
    }
}
