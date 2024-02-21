package leetCodeSolutions.mediumProblems.sortList148;

class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode link = head;

        while(fast != null && fast.next != null){
            link = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        link.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        return mergeSort(left,right);
    }
    public ListNode mergeSort(ListNode l1,ListNode l2){
        ListNode result = new ListNode(0);
        ListNode current = result;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null){
            current.next = l1;
            l1 = l1.next;
        }
        if(l2 != null){
            current.next = l2;
            l2 = l2.next;
        }
        return result.next;
    }
}