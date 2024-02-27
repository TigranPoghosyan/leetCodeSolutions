package leetCodeSolutions.easyProblems.minCostClimbingStair746;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int result = solution.minCostClimbingStairs(cost);
        System.out.println(result);
    }
}
