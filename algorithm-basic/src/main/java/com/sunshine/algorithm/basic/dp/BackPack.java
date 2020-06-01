package com.sunshine.algorithm.basic.dp;

/**
 * 动态规划——背包问题
 * @author sunshine
 * @date 2020/6/1
 */
public class BackPack {

	/**
	 * 状态定义：dp[i][w]
	 * 转移方程：dp[i][w]=max(dp[i-1][w], dp[i-1][w-wt[i-1]]+val[i-1)
	 * @param n   物品个数
	 * @param w   背包容量
	 * @param wt  每个物品重量
	 * @param val 每个物品价值
	 * @return 背包可放入的最大容量
	 */
	public int chooseBackPack(int n, int w, int[] wt, int[] val) {
		if (n < 1 || w < 0) {
			return 0;
		}
		int[][] dp = new int[n + 1][w + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= w; j++) {
				if (wt[i] > j) {
					// 如果当前物品重量比背包还重，则当前重量使用原有重量
					dp[i + 1][j] = dp[i][j];
				} else {
					// 否则根据上一轮计算，或当前轮计算出一个最大重量
					dp[i + 1][j] = Math.max(dp[i][j], dp[i][j - wt[i]] + val[i]);
				}
			}
		}
		return dp[n][w];
	}
}
