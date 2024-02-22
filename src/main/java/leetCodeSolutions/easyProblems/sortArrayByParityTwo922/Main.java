package leetCodeSolutions.easyProblems.sortArrayByParityTwo922;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{4, 2, 5, 7};
        int[] result = solution.sortArrayByParityTwo(nums);
        System.out.println(Arrays.toString(result));
    }
}
