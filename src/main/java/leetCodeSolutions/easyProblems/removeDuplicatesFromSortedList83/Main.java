package leetCodeSolutions.easyProblems.removeDuplicatesFromSortedList83;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode result = solution.deleteDuplicates(listNode);
        System.out.println(result);
    }
}
