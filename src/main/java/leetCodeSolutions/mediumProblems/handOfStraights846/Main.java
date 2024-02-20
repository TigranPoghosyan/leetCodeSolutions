package leetCodeSolutions.mediumProblems.handOfStraights846;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,2,3,6,2,3,4,7,8};
        boolean nStraightHand = solution.isNStraightHand(nums, 3);
        System.out.println(nStraightHand);
    }
}
