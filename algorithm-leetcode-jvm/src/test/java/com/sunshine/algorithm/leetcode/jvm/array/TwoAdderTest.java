package com.sunshine.algorithm.leetcode.jvm.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author sunshine
 * @date 2020/1/20
 */
@DisplayName("两数之和测试用例")
public class TwoAdderTest {

	private int[] nums;

	@Test
	public void twoAdderTestOne() {
		nums = new int[]{2, 7, 11, 15};
		int[] result = new TwoSum().twoSumFirstSolution(nums, 9);
		Arrays.stream(result).forEach(System.out::println);
	}

	@Test
	public void twoAdderTestTwo() {
		nums = new int[]{2, 7, 11, 15};
		int[] result = new TwoSum().twoSumSecondSolution(nums, 9);
		Arrays.stream(result).forEach(System.out::println);
	}

	@Test
	public void twoAdderTestThree() {
		nums = new int[]{3, 2, 4};
		int[] result = new TwoSum().twoSumSecondSolution(nums, 6);
		Arrays.stream(result).forEach(System.out::println);
	}
}
