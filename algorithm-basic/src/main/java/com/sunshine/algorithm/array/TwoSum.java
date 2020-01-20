package com.sunshine.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * @author sunshine
 * @date 2020/1/20
 */
public class TwoSum {

	/**
	 * 暴力穷举
	 * @param nums   数组
	 * @param target 目标值
	 * @return 两数之和等于目标值的数组元素索引
	 */
	public int[] twoSumFirstSolution(int[] nums, int target) {
		if (nums == null || nums.length <= 0) {
			return new int[0];
		}
		if (nums.length == 1) {
			if (nums[0] == target) {
				return nums;
			} else {
				return new int[0];
			}
		}
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[]{i, j};
				}
			}
		}
		return new int[0];
	}

	/**
	 * 使用HashMap
	 * @param nums   数组
	 * @param target 目标值
	 * @return 两数之和等于目标值的数组元素索引
	 */
	public int[] twoSumSecondSolution(int[] nums, int target) {
		if (nums == null || nums.length <= 0) {
			return new int[0];
		}
		if (nums.length == 1) {
			if (nums[0] == target) {
				return nums;
			} else {
				return new int[0];
			}
		}
		Map<Integer, Integer> sumMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (sumMap.containsKey(nums[i])) {
				return new int[]{sumMap.get(nums[i]), i};
			}
			sumMap.put(target - nums[i], i);
		}
		return new int[0];
	}
}
