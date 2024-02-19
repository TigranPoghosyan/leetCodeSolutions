package leetCodeSolutions.easyProblems.palindromeLinkedList234;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        ListNode listNode2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(1))));

        System.out.println(solution.isPalindrome(listNode));
        System.out.println(solution.isPalindrome(listNode2));
    }
}
