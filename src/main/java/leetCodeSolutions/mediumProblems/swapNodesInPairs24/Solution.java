package leetCodeSolutions.mediumProblems.swapNodesInPairs24;


public class Solution {
    public ListNode swapPairs(ListNode head){
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode current = temp;

        while (current.next != null && current.next.next != null){
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return temp.next;
    }
}

//Second solution
// if (head == null || head.next == null) return head;
////         ListNode second = head.next;
////         ListNode third = second.next;
//
////         second.next = head;
////         head.next = swapPairs(third);
//
////         return second;
