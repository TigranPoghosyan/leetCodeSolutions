package leetCodeSolutions.mediumProblems.swapNodesInPairs24;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode list = new ListNode(1, new ListNode(3, new ListNode(5,new ListNode(7))));
        ListNode swappedPairs = solution.swapPairs(list);
        System.out.println(swappedPairs);

    }
}
