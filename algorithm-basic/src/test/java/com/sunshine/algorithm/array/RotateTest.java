package com.sunshine.algorithm.array;

import org.junit.Before;
import org.junit.Test;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-26 20:47
 */
public class RotateTest {

	private Rotate rotate;

	private int[] nums;

	private int k;

	@Before
	public void before() {
		this.rotate = new Rotate();
		this.nums = new int[]{1, 2, 3, 4, 5, 6, 7};
		this.k = 3;
	}

	@Test
	public void rotate() {
		this.rotate.rotate(nums, k);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
