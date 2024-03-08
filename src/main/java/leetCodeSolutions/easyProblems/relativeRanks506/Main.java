package leetCodeSolutions.easyProblems.relativeRanks506;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {10, 3, 8, 9, 4};
        String[] relativeRanks = solution.findRelativeRanks(nums);
        System.out.println(Arrays.toString(relativeRanks));
    }
}
