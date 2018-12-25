package com.sunshine.algorithm.array;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-21 14:51
 */
public class RemoveDumplicate {

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return 1;
		}
		int count = 0;
		int remark = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (remark == nums[i]) {
				count ++;
				remark ==
			}
		}
		return count++;
	}
}
