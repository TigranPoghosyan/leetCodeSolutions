package leetCodeSolutions.mediumProblems.bestTimeToBuyAndSellStockWithCooldown309;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {1, 2, 3, 0, 2};
        int result = solution.maxProfit(prices);
        System.out.println(result);
    }
}
