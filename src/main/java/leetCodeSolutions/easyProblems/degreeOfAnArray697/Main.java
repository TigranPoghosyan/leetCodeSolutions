package leetCodeSolutions.easyProblems.degreeOfAnArray697;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 2, 3, 1};
        int shortestSubArray = solution.findShortestSubArray(nums);
        System.out.println(shortestSubArray);
    }
}
