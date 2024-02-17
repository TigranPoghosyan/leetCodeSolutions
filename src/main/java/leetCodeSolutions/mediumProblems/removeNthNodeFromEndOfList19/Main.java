package leetCodeSolutions.mediumProblems.removeNthNodeFromEndOfList19;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
        ListNode listNode = solution.removeNthFromEnd(list1, 3);
        System.out.println(listNode);
    }
}
