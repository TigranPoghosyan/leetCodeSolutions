package leetCodeSolutions.easyProblems.maxConsecuitiveOnes485;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int maxConsecutiveOnes = solution.findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }
}
