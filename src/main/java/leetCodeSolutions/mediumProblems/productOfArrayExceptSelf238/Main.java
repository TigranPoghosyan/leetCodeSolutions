package leetCodeSolutions.mediumProblems.productOfArrayExceptSelf238;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
