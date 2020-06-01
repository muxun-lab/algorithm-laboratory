package com.sunshine.algorithm.basic.dp;

/**
 * 动态规划——凑硬币问题
 * 1. 常规递归解法
 * 2. 备忘录，存储已经计算过的子问题
 * 3. 递归，除了存储已经计算过的子问题，还可以去除重叠子问题
 * @author sunshine
 * @created 2020-03-08
 */
public class CoinChange {

	/**
	 * 递归
	 * @param amount 给定的总金额
	 * @param coins  硬币组合数组
	 * @return 构成给定金额的最少硬币数量
	 */
	public int coinChangeRecursion(int amount, int[] coins) {
		if (amount == 0) {
			return 0;
		}
		if (amount == -1) {
			return -1;
		}
		int min = -1;
		for (int coin : coins) {
			// 此处为递归，需要进行很多次的循环
			int subDp = coinChangeRecursion(amount - coin, coins);
			if (subDp == -1) {
				continue;
			}
			min = Math.min(min, subDp + 1);
		}
		return min;
	}

	/**
	 * 备忘录
	 * @param amount     给定的总金额
	 * @param coins      硬币组合数组
	 * @param memorandum 用于记录计算过值的备忘录
	 * @return 构成给定金额的最少硬币数量
	 */
	public int coinChangeMemorandum(int amount, int[] coins, int[][] memorandum) {
		// 在备忘录搜寻是否已经记录过子问题
		if (memorandum[amount][0] > 0) {
			return memorandum[amount][0];
		}
		if (amount == 0) {
			return 0;
		}
		int min = -1;
		for (int coin : coins) {
			int subDp = coinChangeMemorandum(amount - coin, coins, memorandum);
			if (subDp == -1) {
				continue;
			}
			min = Math.min(min, subDp + 1);
		}
		// 在备忘录中存储已经计算过的子问题
		memorandum[amount][0] = min;
		return min;
	}

	/**
	 * 动态规划
	 * @param amount 给定的总金额
	 * @param coins  硬币组合数组
	 * @return 构成给定金额的最少硬币数量
	 */
	public int dp(int amount, int[] coins) {
		// 金额为amount时，需要的最少硬币数量
		// 为什么需要+1？
		// 凑成amount的硬币金额最多为amount个（即所有硬币均使用1元硬币）
		// 所以初始化为amount+1相当于初始化为正无穷，方便后续取最小值
		int[] dpTable = new int[amount + 1];
		dpTable[0] = 0;
		for (int i = 0; i < dpTable.length; i++) {
			for (int coin : coins) {
				if (i - coin == -1) {
					continue;
				}
				// 看是当前解最小，还是子问题+1最小
				// 自底向上，之前的问题已经全部计算过了
				dpTable[i] = Math.min(dpTable[i - coin] + 1, dpTable[i]);
			}
		}
		return (dpTable[amount] == amount + 1) ? -1 : dpTable[amount];
	}
}
