package com.sunshine.algorithm.leetcode.jvm.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-01-30
 */
@DisplayName("盛水最多的容器测试类")
public class MaxAreaTest {

	@Test
	public void maxAreaTestOne() {
		Assertions.assertEquals(49, new MaxArea().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
	}

	@Test
	public void maxAreaTestTwo() {
		Assertions.assertEquals(49, new MaxArea().maxAreaOptimization(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
	}
}
