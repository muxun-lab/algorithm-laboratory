package com.sunshine.algorithm.basic.dp;

import java.util.Arrays;

/**
 * 题号: 322
 * 题目: <a href="https://leetcode.cn/problems/coin-change">零钱兑换</a>
 * 详情: 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
 * <p>
 * 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。
 * <p>
 * 你可以认为每种硬币的数量是无限的。
 * @author 慕勋
 * @created 2020-03-08
 */
public class LeetCode322 {

	/**
	 * 思路: 递归
	 * @param amount 给定的总金额
	 * @param coins  硬币组合数组
	 * @return 构成给定金额的最少硬币数量
	 */
	public int coinChangeByRecursion(int amount, int[] coins) {
		if (amount == 0) {
			return 0;
		}
		if (amount == -1) {
			return -1;
		}
		int min = -1;
		for (int coin : coins) {
			// 此处为递归，需要进行很多次的循环
			int subDp = coinChangeByRecursion(amount - coin, coins);
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
	public int coinChangeByMemorandum(int amount, int[] coins, int[][] memorandum) {
		// 在备忘录搜寻是否已经记录过子问题
		if (memorandum[amount][0] > 0) {
			return memorandum[amount][0];
		}
		if (amount == 0) {
			return 0;
		}
		int min = -1;
		for (int coin : coins) {
			int subDp = coinChangeByMemorandum(amount - coin, coins, memorandum);
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
	 * 思路: 动态规划
	 * @param amount 给定的总金额
	 * @param coins  硬币组合数组
	 * @return 构成给定金额的最少硬币数量
	 */
	public int coinChangeByDP(int amount, int[] coins) {
		// 金额为amount时，需要的最少硬币数量
		// 为什么需要+1？
		// 凑成amount的硬币金额最多为amount个（即所有硬币均使用1元硬币）
		// 所以初始化为amount+1相当于初始化为正无穷，方便后续取最小值
		int max = amount + 1;
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, max);
		dp[0] = 0;
		for (int i = 1; i <= amount; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= i) {
					dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
				}
			}
		}
		return dp[amount] > amount ? -1 : dp[amount];
	}
}
