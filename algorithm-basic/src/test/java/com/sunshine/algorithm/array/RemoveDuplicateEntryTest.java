package com.sunshine.algorithm.array;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-25 19:56
 */
public class RemoveDuplicateEntryTest {

	private int[] nums;

	private RemoveDuplicateEntry removeDuplicateEntry;

	@Before
	public void before() {
		removeDuplicateEntry = new RemoveDuplicateEntry();
		nums = new int[]{1};
	}

	@Test
	public void removeDuplicateTestOne() {
		nums = new int[]{3, 2, 2, 3};
		int count = this.removeDuplicateEntry.removeDuplicates(this.nums, 3);
		out(this.nums, count);
	}

	@Test
	public void removeDuplicateTestTwo() {
		nums = new int[]{1};
		int count = this.removeDuplicateEntry.removeDuplicates(this.nums, 1);
		out(this.nums, count);
	}

	private void out(int[] nums, int count) {
		System.out.println("重复元素个数:" + count);
		System.out.println("数组:" + Arrays.toString(nums));
	}
}
