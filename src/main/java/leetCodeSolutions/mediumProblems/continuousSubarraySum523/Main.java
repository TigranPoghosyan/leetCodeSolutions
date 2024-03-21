package leetCodeSolutions.mediumProblems.continuousSubarraySum523;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {23, 2, 4, 6, 7};
        boolean result = solution.checkSubarraySum(nums, 6);
        System.out.println(result);
    }
}
