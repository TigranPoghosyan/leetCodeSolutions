package leetCodeSolutions.mediumProblems.rotateArray189;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4,5,6,7};
        solution.rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
}
