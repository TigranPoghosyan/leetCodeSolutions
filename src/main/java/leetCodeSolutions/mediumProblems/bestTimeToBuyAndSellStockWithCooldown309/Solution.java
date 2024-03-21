package leetCodeSolutions.mediumProblems.bestTimeToBuyAndSellStockWithCooldown309;

class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0;
        int prevSell = 0;
        int buy = Integer.MIN_VALUE;
        int prevBuy = 0;

        for(int price:prices){
            prevBuy = buy;
            buy = Math.max(prevSell-price,prevBuy);
            prevSell = sell;
            sell = Math.max(prevBuy+price,prevSell);
        }
        return sell;
    }
}
