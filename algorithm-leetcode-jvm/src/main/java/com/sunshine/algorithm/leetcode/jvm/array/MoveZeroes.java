package com.sunshine.algorithm.leetcode.jvm.array;

/**
 * 题号：283
 * 题目：移动零
 * 详情：给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * @author sunshine
 * @created 2020-01-29
 */
public class MoveZeroes {

	/**
	 * 思路：移位，冒泡排序
	 * @param nums 给定数组
	 */
	public void moveZeroes(int[] nums) {
		int count = 0;
		int start = 0;
		while (start + count < nums.length) {
			if (nums[start] == 0) {
				for (int j = start; j < nums.length - count - 1; j++) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
				count++;
			}
			if (nums[start] != 0) {
				start++;
			}
		}
	}

	/**
	 * 优化：0...count-1为元素，count之后的元素置为0
	 * @param nums 给定数组
	 */
	public void moveZeroesOptimization(int[] nums) {
		int lastZeroIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[lastZeroIndex++] = nums[i];
			}
		}

		for (int i = lastZeroIndex; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
}
