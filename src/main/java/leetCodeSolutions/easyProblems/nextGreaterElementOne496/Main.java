package leetCodeSolutions.easyProblems.nextGreaterElementOne496;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = solution.nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
