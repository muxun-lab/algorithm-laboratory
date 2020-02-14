package com.sunshine.algorithm.leetcode.jvm.array;

/**
 * 题号：11
 * 题目：盛水最多的容器
 * 详情：给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使
 * 得它们与 x 轴共同构成的容器可以容纳最多的水。
 * @author sunshine
 * @created 2020-01-30
 */
public class MaxArea {

	/**
	 * 思路：暴力破解
	 * @param height 给定的数组高度数组
	 * @return 面积最大的矩形
	 */
	public int maxArea(int[] height) {
		int max = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = height.length - 1; j > i; j--) {
				max = Math.max((j - i) * Math.min(height[i], height[j]), max);
			}
		}
		return max;
	}

	/**
	 * 思路：双指针两端向中间遍历
	 * 从大到小逐渐缩小范围，第一个矩形设为最大的面积
	 * 下一个更大的矩形面积需要是高比现在更高的，也就是数组值更大的
	 * @param height 给定的数组高度数组
	 * @return 面积最大的矩形
	 */
	public int maxAreaOptimization(int[] height) {
		int start = 0;
		int end = height.length - 1;
		int max = 0;
		while (start < end) {
			max = Math.max(max, Math.min(height[start], height[end]) * (end - start));
			if (height[start] > height[end]) {
				end--;
			} else {
				start++;
			}
		}
		return max;
	}
}
