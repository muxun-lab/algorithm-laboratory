package com.sunshine.algorithm.leetcode.jvm.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-02-17
 */
@DisplayName("在排序数组中查找元素的第一个和最后一个位置测试类")
public class SearchRangeTest {

	@Test
	public void searchRangeTestOne() {
		Assertions.assertArrayEquals(new int[]{3, 4}, new SearchRange().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
	}

	@Test
	public void searchRangeTestTwo() {
		Assertions.assertArrayEquals(new int[]{-1, -1}, new SearchRange().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
	}

	@Test
	public void searchRangeTestThree() {
		Assertions.assertArrayEquals(new int[]{-1, -1}, new SearchRange().searchRange(new int[]{2, 2}, 3));
	}
}
