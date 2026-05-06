class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = i + 1;
        int max = 0;
        while (i < prices.length - 1) {
            if (j >= prices.length) { // 꽉차면 초기화
                i++;
                j = i + 1;
                continue;
            }
            if (prices[i] >= prices[j]) {
                // j값이 i보다 작거나 같으면 손해임. 같으면 0이겠지만
                j++;
                continue;
            }
            max = (prices[j] - prices[i]) > max ? prices[j] - prices[i] : max;
            System.out.printf("prices[%d] - prices[%d] = %d \n", j, i, max);
            j++;
        }
        return max;
    }
}
