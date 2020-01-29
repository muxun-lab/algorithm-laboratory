package com.sunshine.algorithm.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author sunshine
 * @created 2020-01-29
 */
@DisplayName("两数之和数组升序版测试类")
public class TwoSumSortedArrayTest {

	@Test
	public void twoSumSortedArrayTestOne() {
		Arrays.stream(new TwoSumSortedArray().twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(System.out::println);
	}

	@Test
	public void twoSumSortedArrayTestTwo() {
		Arrays.stream(new TwoSumSortedArray().twoSum(new int[]{2}, 9)).forEach(System.out::println);
	}

	@Test
	public void twoSumSortedArrayTestThree() {
		Arrays.stream(new TwoSumSortedArray().twoSum(new int[]{2, 3}, 9)).forEach(System.out::println);
	}

	@Test
	public void twoSumSortedArrayTestFour() {
		Arrays.stream(new TwoSumSortedArray().twoSum(new int[]{2, 7}, 9)).forEach(System.out::println);
	}
}
