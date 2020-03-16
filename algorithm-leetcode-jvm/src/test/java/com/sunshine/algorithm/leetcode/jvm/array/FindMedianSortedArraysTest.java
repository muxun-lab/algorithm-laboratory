package com.sunshine.algorithm.leetcode.jvm.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-16
 */
@DisplayName("寻找两个有序数组的中位数单元测试")
public class FindMedianSortedArraysTest {

	@Test
	public void findMedianSortedArraysTestOne() {
		Assertions.assertEquals(2.0, new FindMedianSortedArrays().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
	}

	@Test
	public void findMedianSortedArraysTestTwo() {
		Assertions.assertEquals(2.5, new FindMedianSortedArrays().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
	}

	@Test
	public void findMedianSortedArraysTestThree() {
		Assertions.assertEquals(3.5, new FindMedianSortedArrays().findMedianSortedArrays(new int[]{1, 4, 5}, new int[]{2, 3, 6}));
	}

	@Test
	public void findMedianSortedArraysTestFour() {
		Assertions.assertEquals(3.5, new FindMedianSortedArrays().findMedianSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
	}

	@Test
	public void findMedianSortedArraysTestFive() {
		Assertions.assertEquals(3.5, new FindMedianSortedArrays().findMedianSortedArrays(new int[]{1, 2, 6}, new int[]{3, 4, 5}));
	}

	@Test
	public void findMedianSortedArraysTestSix() {
		Assertions.assertEquals(1, new FindMedianSortedArrays().findMedianSortedArrays(new int[]{}, new int[]{1}));
	}

	@Test
	public void findMedianSortedArraysTestSeven() {
		Assertions.assertEquals(1, new FindMedianSortedArrays().findMedianSortedArrays(new int[]{1}, new int[]{}));
	}

	@Test
	public void findMedianSortedArraysTestEight() {
		Assertions.assertEquals(1.5, new FindMedianSortedArrays().findMedianSortedArrays(new int[]{1, 2}, new int[]{}));
	}

	@Test
	public void findMedianSortedArraysTestNine() {
		Assertions.assertEquals(-1.0, new FindMedianSortedArrays().findMedianSortedArrays(new int[]{3}, new int[]{-2, -1}));
	}

	@Test
	public void findMedianSortedArraysUpgradeTestOne() {
		Assertions.assertEquals(2.0, new FindMedianSortedArrays().findMedianSortedArraysUpgrade(new int[]{1, 3}, new int[]{2}));
	}

	@Test
	public void findMedianSortedArraysUpgradeTestTwo() {
		Assertions.assertEquals(2.5, new FindMedianSortedArrays().findMedianSortedArraysUpgrade(new int[]{1, 2}, new int[]{3, 4}));
	}

	@Test
	public void findMedianSortedArraysUpgradeTestThree() {
		Assertions.assertEquals(3.5, new FindMedianSortedArrays().findMedianSortedArraysUpgrade(new int[]{1, 4, 5}, new int[]{2, 3, 6}));
	}

	@Test
	public void findMedianSortedArraysUpgradeTestFour() {
		Assertions.assertEquals(3.5, new FindMedianSortedArrays().findMedianSortedArraysUpgrade(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
	}

	@Test
	public void findMedianSortedArraysUpgradeTestFive() {
		Assertions.assertEquals(3.5, new FindMedianSortedArrays().findMedianSortedArraysUpgrade(new int[]{1, 2, 6}, new int[]{3, 4, 5}));
	}

	@Test
	public void findMedianSortedArraysUpgradeTestSix() {
		Assertions.assertEquals(1, new FindMedianSortedArrays().findMedianSortedArraysUpgrade(new int[]{}, new int[]{1}));
	}

	@Test
	public void findMedianSortedArraysUpgradeTestSeven() {
		Assertions.assertEquals(1, new FindMedianSortedArrays().findMedianSortedArraysUpgrade(new int[]{1}, new int[]{}));
	}

	@Test
	public void findMedianSortedArraysUpgradeTestEight() {
		Assertions.assertEquals(1.5, new FindMedianSortedArrays().findMedianSortedArraysUpgrade(new int[]{1, 2}, new int[]{}));
	}

	@Test
	public void findMedianSortedArraysUpgradeTestNine() {
		Assertions.assertEquals(-1.0, new FindMedianSortedArrays().findMedianSortedArraysUpgrade(new int[]{3}, new int[]{-2, -1}));
	}
}
