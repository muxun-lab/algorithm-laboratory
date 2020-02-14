package com.sunshine.algorithm.leetcode.jvm.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author sunshine
 * @created 2020-01-30
 */
@DisplayName("四数之和测试类")
public class FourSumTest {

	@Test
	public void fourSumTestOne() {
		Assertions.assertIterableEquals(Arrays.asList(Arrays.asList(-2, -1, 1, 2), Arrays.asList(-2, 0, 0, 2), Arrays.asList(-1, 0, 0, 1)),
				new FourSum().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
	}

	@Test
	public void fourSumTestTwo() {
		Assertions.assertIterableEquals(Arrays.asList(Arrays.asList(-4, 0, 1, 2), Arrays.asList(-1, -1, 0, 1)),
				new FourSum().fourSum(new int[]{-1, 0, 1, 2, -1, -4}, -1));
	}
}
