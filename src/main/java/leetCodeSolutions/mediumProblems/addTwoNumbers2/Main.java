package leetCodeSolutions.mediumProblems.addTwoNumbers2;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode firstListNode = new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode secondListNode = new ListNode(5,new ListNode(6,new ListNode(4)));
        ListNode result = solution.addTwoNumbers(firstListNode, secondListNode);
        System.out.println(result);
    }
}
