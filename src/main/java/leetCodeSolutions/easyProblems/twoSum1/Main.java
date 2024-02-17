package leetCodeSolutions.easyProblems.twoSum1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int[] ints = solution.twoSum(nums, 9);
        System.out.println(Arrays.toString(ints));
    }
}
