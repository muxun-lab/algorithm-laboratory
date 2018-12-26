package com.sunshine.algorithm.array;

/**
 * 数组移位
 *
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-26 19:44
 */
public class Rotate {

	public void rotate(int[] nums, int k) {
		if (nums.length <= k) {
			return;
		}
		int length = nums.length;
		int i = length - k;
		while (i < length) {
			int postion = i % (k + 1);
			int temp = nums[i];
			nums[i] = nums[postion];
			nums[postion] = temp;
			i++;
		}
	}
}
