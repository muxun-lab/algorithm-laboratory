package com.sunshine.algorithm.leetcode.jvm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 题号：15
 * 题目：三数之和
 * 题链：https://leetcode-cn.com/problems/3sum/
 * 详情：给你一个包含 n 个整数的数组 nums
 * 判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
 * 请你找出所有满足条件且不重复的三元组。
 * @author sunshine
 * @date 2020/1/20
 */
public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		if (nums == null || nums.length <= 2) {
			return Collections.emptyList();
		}
		Arrays.sort(nums);
		List<List<Integer>> resultList = new ArrayList<>();
		for (int i = 0; i < nums.length - 1; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				if (nums[i] + nums[left] + nums[right] == 0) {
					List<Integer> result = new ArrayList<>();
					result.add(nums[i]);
					result.add(nums[left]);
					result.add(nums[right]);
					resultList.add(result);
					while (left < right && nums[left] == nums[++left]) ;
					while (left < right && nums[right] == nums[--right]) ;
				} else if (nums[i] + nums[left] + nums[right] < 0) {
					while (left < right && nums[left] == nums[++left]) ;
				} else {
					while (left < right && nums[right] == nums[--right]) ;
				}
			}
		}
		return resultList;
	}
}
