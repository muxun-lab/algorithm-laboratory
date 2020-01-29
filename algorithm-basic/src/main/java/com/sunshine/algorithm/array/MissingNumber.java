package com.sunshine.algorithm.array;

/**
 * 题号：268
 * 题目：缺失数字
 * 详情：给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * @author sunshine
 * @created 2020-01-29
 */
public class MissingNumber {

	/**
	 * 简单思路：排序
	 * @param nums 给定的序列乱序数组
	 * @return 不在序列中的元素
	 */
	public int missingNumber(int[] nums) {
		int sum = 0;
		for (int i = 0; i <= nums.length; i++) {
			sum += i;
		}
		for (int num : nums) {
			sum -= num;
		}
		return sum;
	}
}
