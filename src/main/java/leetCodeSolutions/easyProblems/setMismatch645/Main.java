package leetCodeSolutions.easyProblems.setMismatch645;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 2, 4};
        int[] errorNums = solution.findErrorNums(nums);
        System.out.println(Arrays.toString(errorNums));
    }
}
