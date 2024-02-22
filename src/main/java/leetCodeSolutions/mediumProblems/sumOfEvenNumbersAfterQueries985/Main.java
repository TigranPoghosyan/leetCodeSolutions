package leetCodeSolutions.mediumProblems.sumOfEvenNumbersAfterQueries985;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        int[] result = solution.sumEvenAfterQueries(nums,queries);
        System.out.println(Arrays.toString(result));
    }
}
