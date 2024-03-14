package leetCodeSolutions.mediumProblems.nextPermutation31;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 1};
        solution.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
