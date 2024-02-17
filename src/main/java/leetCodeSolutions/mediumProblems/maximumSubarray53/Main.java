package leetCodeSolutions.mediumProblems.maximumSubarray53;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        Solution solution = new Solution();
        int result = solution.maxSubArray(nums);
        System.out.println(result);
    }
}
