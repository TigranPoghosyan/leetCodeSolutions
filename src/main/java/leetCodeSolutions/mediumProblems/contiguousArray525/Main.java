package leetCodeSolutions.mediumProblems.contiguousArray525;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1};
        int maxLength = solution.findMaxLength(nums);
        System.out.println(maxLength);
    }
}
