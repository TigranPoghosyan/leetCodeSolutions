package leetCodeSolutions.mediumProblems.findFirstAndLastPositionOfElementInSortedArray34;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] result = solution.searchRange(nums, 8);
        System.out.println(Arrays.toString(result));
    }
}
