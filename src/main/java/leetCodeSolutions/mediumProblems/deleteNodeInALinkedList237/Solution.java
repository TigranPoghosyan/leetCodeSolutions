package leetCodeSolutions.mediumProblems.deleteNodeInALinkedList237;

public class Solution {
    public void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
