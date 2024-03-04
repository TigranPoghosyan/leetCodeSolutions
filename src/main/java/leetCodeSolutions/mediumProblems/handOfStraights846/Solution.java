package leetCodeSolutions.mediumProblems.handOfStraights846;

import java.util.PriorityQueue;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int elem : hand) {
            queue.add(elem);
        }
        while (!queue.isEmpty()) {
            int value = queue.poll();
            for (int i = 1; i < groupSize; i++) {
                if (!queue.remove(value + i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
