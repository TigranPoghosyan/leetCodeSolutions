package leetCodeSolutions.easyProblems.linkedListCycle141;

public class Solution {
    public boolean hasCycle(ListNode head){
        if (head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.nextNode;

        while (slow != fast){
            if (fast == null || fast.nextNode == null){
                return false;
            }
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
        }
        return true;
    }
}
