package leetCodeSolutions.easyProblems.singleNumber136;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2,1,9,1,5,7,5,4,4,8,8,9,3,2,3};
        int result = solution.singleNumber(nums);
        System.out.println(result);
    }
}
