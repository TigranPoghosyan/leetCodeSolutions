package leetCodeSolutions.easyProblems.bestTimeToBuyAndSellStock121;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int result = solution.maxProfit(prices);
        System.out.println(result);
    }
}
