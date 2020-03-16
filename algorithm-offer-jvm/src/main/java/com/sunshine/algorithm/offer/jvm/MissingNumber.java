package com.sunshine.algorithm.offer.jvm;

/**
 * 题号：面试题53-II
 * 题目：0~n-1中缺失的数字
 * 详情：一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内
 * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字
 * @author sunshine
 * @created 2020-03-16
 */
public class MissingNumber {

	/**
	 * 思路：缺失的数字为x，使用二分法
	 * @param nums 缺失一个数字的有序数组
	 * @return 缺失的数字
	 */
	public int missingNumber(int[] nums) {
		int left = 0, right = nums.length - 1;
		while (left <= right) {
			int middle = (left + right) / 2;
			if (nums[middle] == middle) {
				left = middle + 1;
			} else if (nums[middle] > middle) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}
		return left;
	}
}
