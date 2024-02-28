package leetCodeSolutions.mediumProblems.deleteNodeInALinkedList237;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        solution.deleteNode(node);
        System.out.println(node);
    }
}
