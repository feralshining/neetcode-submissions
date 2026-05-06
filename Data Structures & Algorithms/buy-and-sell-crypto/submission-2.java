class Solution {
    public int maxProfit(int[] prices) {
                // 목표 : O(n)
        int minPrice = prices[0], maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // 이익 최대를 구하려면, 최솟값만 알면 됨.
            // 현재값 - 최솟값 = 이익
            // 최대 이익은 위 식에서 구한 이익 중 MAX이고, 그것만 반환하면 됨
            minPrice = Math.min(minPrice, prices[i]); // 항상 최솟값만 담김
            maxProfit = Math.max(maxProfit, prices[i] - minPrice); // 항상 최선의 이익만 담김
            System.out.printf("minPrice = %d, maxProfit = %d \n", minPrice, maxProfit);
        }
        return maxProfit;
    }
}
