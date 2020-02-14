package com.sunshine.algorithm.leetcode.jvm.array;

/**
 * 第27题，移除元素
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-21 14:51
 */
public class RemoveDuplicateEntry {

	public int removeDuplicates(int[] nums, int val) {
		if (nums.length == 0) {
			return 0;
		}
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[index] = nums[i];
				index++;
			}
		}
		return index;
	}
}
