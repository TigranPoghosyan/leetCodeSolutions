package leetCodeSolutions.easyProblems.squaresOfASortedArray977;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{-4,-1,0,3,10};
        int[] result = solution.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}
