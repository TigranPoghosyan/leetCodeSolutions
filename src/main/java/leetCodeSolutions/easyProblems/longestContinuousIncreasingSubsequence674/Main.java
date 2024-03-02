package leetCodeSolutions.easyProblems.longestContinuousIncreasingSubsequence674;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 4, 7};
        int lengthOfLCIS = solution.findLengthOfLCIS(nums);
        System.out.println(lengthOfLCIS);
    }
}
