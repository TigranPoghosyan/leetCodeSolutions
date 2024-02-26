package leetCodeSolutions.mediumProblems.reorderList143;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        solution.reorderList(listNode);
        System.out.println(listNode);
    }
}
