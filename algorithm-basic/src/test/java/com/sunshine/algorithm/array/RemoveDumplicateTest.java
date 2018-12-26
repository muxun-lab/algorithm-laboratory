package com.sunshine.algorithm.array;

import org.junit.Before;
import org.junit.Test;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-25 19:56
 */
public class RemoveDumplicateTest {

	private int[] nums;

	private RemoveDumplicate removeDumplicate;

	@Before
	public void before() {
		removeDumplicate = new RemoveDumplicate();
		nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
	}

	@Test
	public void removeDumplicateTest() {
		int count = this.removeDumplicate.removeDuplicates(this.nums);
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.println(nums[i]);
		}
	}
}
