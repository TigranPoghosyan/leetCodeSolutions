package leetCodeSolutions.hardProblems.slidingWindowMaximum239;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] result = solution.maxSlidingWindow(nums,3);
        System.out.println(Arrays.toString(result));
    }
}
