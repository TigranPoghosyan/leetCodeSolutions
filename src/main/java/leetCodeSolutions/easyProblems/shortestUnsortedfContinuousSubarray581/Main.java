package leetCodeSolutions.easyProblems.shortestUnsortedfContinuousSubarray581;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        int unsortedSubarray = solution.findUnsortedSubarray(nums);
        System.out.println(unsortedSubarray);
    }
}
