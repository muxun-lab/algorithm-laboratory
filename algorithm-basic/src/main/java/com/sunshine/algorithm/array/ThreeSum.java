package com.sunshine.algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 三数之和
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
