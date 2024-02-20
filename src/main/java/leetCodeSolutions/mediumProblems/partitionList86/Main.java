package leetCodeSolutions.mediumProblems.partitionList86;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2))))));
        ListNode partition = solution.partition(head, 3);
        System.out.println(partition);
    }
}
