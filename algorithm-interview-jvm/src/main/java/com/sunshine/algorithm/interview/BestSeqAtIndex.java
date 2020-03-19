package com.sunshine.algorithm.interview;

import java.util.Arrays;

/**
 * 题号：面试题17.08
 * 题目：马戏团人塔
 * 详情：有个马戏团正在设计叠罗汉的表演节目，一个人要站在另一人的肩膀上
 * 出于实际和美观的考虑，在上面的人要比下面的人矮一点且轻一点
 * 已知马戏团每个人的身高和体重，请编写代码计算叠罗汉最多能叠几个人
 * @author sunshine
 * @created 2020-03-19
 */
public class BestSeqAtIndex {

	/**
	 * 思路：排序，最长上升子序列
	 * @param height 身高数组
	 * @param weight 体重数组
	 * @return 可罗列的最大人数
	 */
	public int bestSeqAtIndex(int[] height, int[] weight) {
		int n = height.length;
		if (n <= 1) {
			return n;
		}
		int[][] array = new int[n][2];
		for (int i = 0; i < n; i++) {
			array[i][0] = height[i];
			array[i][1] = weight[i];
		}
		Arrays.sort(array, (o1, o2) -> {
			if (o1[0] == o2[0]) {
				return o2[1] - o1[1];
			}
			return o1[0] - o2[0];
		});
		int[] tails = new int[n];
		tails[0] = array[0][1];
		int j = 0;
		for (int i = 1; i < n; i++) {
			int currentWeight = array[i][1];
			if (tails[j] < currentWeight) {
				j++;
				tails[j] = currentWeight;
			} else {
				int left = 0;
				int right = j;
				while (left < right) {
					int middle = (left + right) >>> 1;
					if (currentWeight > tails[middle]) {
						left = middle + 1;
					} else {
						right = middle;
					}
				}
				tails[left] = currentWeight;
			}
		}
		return j + 1;
	}

	/**
	 * 思路：动态规划
	 * @param height 身高数组
	 * @param weight 体重数组
	 * @return 可罗列的最大人数
	 */
	public int bestSeqAtIndexDP(int[] height, int[] weight) {
		int n = height.length;
		if (n <= 1) {
			return n;
		}
		int[][] array = new int[n][2];
		for (int i = 0; i < n; i++) {
			array[i][0] = height[i];
			array[i][1] = weight[i];
		}
		Arrays.sort(array, (o1, o2) -> {
			if (o1[0] == o2[0]) {
				return o2[1] - o1[1];
			}
			return o1[0] - o2[0];
		});
		int[] dp = new int[n];
		Arrays.fill(dp, 1);
		int max = dp[0];
		for (int i = 1; i < n; i++) {
			int currentMax = 1;
			for (int j = 0; j < i; j++) {
				if (array[i][1] < array[j][1]) {
					continue;
				}
				currentMax = Math.max(currentMax, dp[j] + 1);
			}
			dp[i] = currentMax;
			max = Math.max(max, dp[i]);
		}
		return max;
	}
}
