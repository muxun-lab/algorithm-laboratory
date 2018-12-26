package com.sunshine.algorithm.array;

/**
 * 最大利润
 *
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-25 20:16
 */
public class MaxProfit {

	public int maxProfit(int[] prices) {
		if (prices.length <= 1) {
			return 0;
		}
		int i = 0;
		int buy = 0;
		int sell = 0;
		int profit = 0;
		while (i < prices.length - 1) {
			while (i < prices.length - 1 && prices[i + 1] <= prices[i]) {
				i++;
			}
			buy = prices[i];
			while (i < prices.length - 1 && prices[i + 1] > prices[i]) {
				i++;
			}
			sell = prices[i];
			profit += sell - buy;
		}
		return profit;
	}
}
