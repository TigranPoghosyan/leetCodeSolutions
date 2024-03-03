package leetCodeSolutions.mediumProblems.subarrayProductLessThanK713;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {10, 5, 2, 6};
        int result = solution.numSubarrayProductLessThanK(nums, 8);
        System.out.println(result);
    }
}
