package com.sunshine.algorithm.leetcode.jvm.array;

/**
 * 题号：34
 * 题目：在排序数组中查找元素的第一个和最后一个位置
 * 详情：
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * <p>
 * 如果数组中不存在目标值，返回 [-1, -1]。
 * @author sunshine
 * @created 2020-02-17
 */
public class SearchRange {

	/**
	 * 思路：左边界和右边界的二分查找
	 * @param nums   给定的正序数组
	 * @param target 进行搜索的目标值
	 * @return 给定目标值在数组内的范围
	 */
	public int[] searchRange(int[] nums, int target) {
		if (nums.length <= 0) {
			return new int[]{-1, -1};
		}
		int start = 0, end = nums.length;
		int startIndex = -1, endIndex = -1;
		// 计算左边界
		while (start < end) {
			int middle = (start + end) / 2;
			if (nums[middle] == target) {
				end = middle;
			} else if (nums[middle] < target) {
				start = middle + 1;
			} else if (nums[middle] > target) {
				end = middle;
			}
		}
		if (start < nums.length) {
			startIndex = nums[start] == target ? start : -1;
		}
		// 计算右边界
		start = 0;
		end = nums.length;
		while (start < end) {
			int middle = (start + end) / 2;
			if (nums[middle] == target) {
				start = middle + 1;
			} else if (nums[middle] < target) {
				start = middle + 1;
			} else if (nums[middle] > target) {
				end = middle;
			}
		}
		if (end != 0) {
			endIndex = nums[start - 1] == target ? (start - 1) : -1;
		}
		return new int[]{startIndex, endIndex};
	}
}
