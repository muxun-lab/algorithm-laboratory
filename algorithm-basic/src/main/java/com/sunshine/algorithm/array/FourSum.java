package com.sunshine.algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 题号：18
 * 题目：四数之和
 * 详情：给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，
 * 使得 a + b + c + d 的值与 target 相等？
 * 找出所有满足条件且不重复的四元组。
 * @author sunshine
 * @created 2020-01-30
 */
public class FourSum {

	/**
	 * 思路：在三数之和{@link ThreeSum}基础之上，再多加一层for循环和与上一个已处理元素的等值判断
	 * @param nums   整数数组
	 * @param target 目标值
	 * @return 四数之和等于目标值的所有不重复情况列表
	 */
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> resultList = new ArrayList<>();
		if (nums.length < 4) {
			return resultList;
		}
		if (nums.length == 4) {
			if (nums[0] + nums[1] + nums[2] + nums[3] == target) {
				List<Integer> currentList = new ArrayList<>();
				currentList.add(nums[0]);
				currentList.add(nums[1]);
				currentList.add(nums[2]);
				currentList.add(nums[3]);
				resultList.add(currentList);
			}
			return resultList;
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < nums.length - 2; j++) {
				int start = j + 1;
				int end = nums.length - 1;
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue;
				}
				while (start < end) {
					int sum = nums[i] + nums[j] + nums[start] + nums[end];
					if (sum > target) {
						end--;
					} else if (sum < target) {
						start++;
					} else {
						List<Integer> currentList = new ArrayList<>();
						currentList.add(nums[i]);
						currentList.add(nums[j]);
						currentList.add(nums[start]);
						currentList.add(nums[end]);
						resultList.add(currentList);
						while (start < end && nums[start] == nums[++start]) ;
						while (start < end && nums[end] == nums[--end]) ;
					}
				}
			}
		}
		return resultList;
	}
}

