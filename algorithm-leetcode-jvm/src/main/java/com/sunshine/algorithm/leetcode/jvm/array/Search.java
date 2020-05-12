package com.sunshine.algorithm.leetcode.jvm.array;

/**
 * 题号：33
 * 题目：搜索旋转排序数组
 * 详情：
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * (例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2])
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * <p>
 * 你可以假设数组中不存在重复的元素。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * @author sunshine
 * @created 2020-02-17
 */
public class Search {

	/**
	 * 思路：二分查找
	 * @param nums   给定的旋转数组
	 * @param target 给定的目标值
	 * @return 目标值在数组中的索引，不在数组中返回-1
	 */
	public int search(int[] nums, int target) {
		if (nums[0] == target) {
			return 0;
		}
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (nums[middle] == target) {
				return middle;
			}
			// 前半部分有序
			if (nums[start] <= nums[middle]) {
				// target在前半部分
				if (nums[start] <= target && target <= nums[middle]) {
					end = middle - 1;
				} else {
					start = middle + 1;
				}
				// 后半部分有序
			} else {
				if (target <= nums[end] && target > nums[middle]) {
					start = middle + 1;
				} else {
					end = middle - 1;
				}
			}
		}
		return -1;
	}
}
