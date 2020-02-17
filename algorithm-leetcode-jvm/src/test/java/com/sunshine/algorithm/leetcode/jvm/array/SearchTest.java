package com.sunshine.algorithm.leetcode.jvm.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-02-17
 */
@DisplayName("搜索旋转排序数组")
public class SearchTest {

	@Test
	public void searchTestOne() {
		Assertions.assertEquals(4, new Search().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
	}

	@Test
	public void searchTestTwo() {
		Assertions.assertEquals(-1, new Search().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
	}
}
