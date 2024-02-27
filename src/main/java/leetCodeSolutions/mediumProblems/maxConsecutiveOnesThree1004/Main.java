package leetCodeSolutions.mediumProblems.maxConsecutiveOnesThree1004;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int result = solution.longestOnes(nums, 3);
        System.out.println(result);
    }
}
