package leetCodeSolutions.mediumProblems.longestConsecutiveSequence128;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int maxLength = 0;
        for (int num : nums) {

            int currentLength = 1;
            int currentNum = num;

            if (!set.contains(currentNum - 1)) {
                while (set.contains(currentNum + 1)) {
                    currentLength += 1;
                    currentNum += 1;
                }
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
