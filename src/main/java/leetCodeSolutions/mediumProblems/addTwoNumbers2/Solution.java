package leetCodeSolutions.mediumProblems.addTwoNumbers2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;

        int carry = 0;

        while(l1 != null || l2 != null){
            int l1Val = (l1 != null) ? l1.val : 0;
            int l2Val = (l2 != null) ? l2.val : 0;

            int currentSum = l1Val + l2Val + carry;
            carry = currentSum / 10;
            int lastDigit = currentSum % 10;

            ListNode newNode = new ListNode(lastDigit);
            current.next = newNode;

            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
            current = current.next;
        }
        if (carry > 0){
            ListNode newNode = new ListNode(0);
            current.next = newNode;
            current = current.next;
        }
        return result.next;
    }
}
