package leetCodeSolutions.easyProblems.linkedListCycle141;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Create nodes for the linked list
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        // Link the nodes together to form a cyclic linked list
        node1.nextNode = node2;
        node2.nextNode = node3;
        node3.nextNode = node4;
        node4.nextNode = node5;
        node5.nextNode = node2; // Make it cyclic by linking the last node to node2

        boolean result = solution.hasCycle(node1);
        System.out.println(result);
    }
}
