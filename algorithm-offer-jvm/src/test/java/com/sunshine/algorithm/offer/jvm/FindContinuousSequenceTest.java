package com.sunshine.algorithm.offer.jvm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-06
 */
@DisplayName("和为s的连续正数序列")
public class FindContinuousSequenceTest {

	@Test
	public void findContinuousSequenceTestOne() {
		int[][] resultArray = {{2, 3, 4}, {4, 5}};
		Assertions.assertArrayEquals(resultArray, new FindContinuousSequence().findContinuousSequence(9));
	}

	@Test
	public void findContinuousSequenceTestTwo() {
		int[][] resultArray = {{1, 2, 3, 4, 5}, {4, 5, 6}, {7, 8}};
		Assertions.assertArrayEquals(resultArray, new FindContinuousSequence().findContinuousSequence(15));
	}

	@Test
	public void findContinuousSequenceUpgradeTestOne() {
		int[][] resultArray = {{2, 3, 4}, {4, 5}};
		Assertions.assertArrayEquals(resultArray, new FindContinuousSequence().findContinuousSequence(9));
	}

	@Test
	public void findContinuousSequenceUpgradeTestTwo() {
		int[][] resultArray = {{1, 2, 3, 4, 5}, {4, 5, 6}, {7, 8}};
		Assertions.assertArrayEquals(resultArray, new FindContinuousSequence().findContinuousSequence(15));
	}
}
