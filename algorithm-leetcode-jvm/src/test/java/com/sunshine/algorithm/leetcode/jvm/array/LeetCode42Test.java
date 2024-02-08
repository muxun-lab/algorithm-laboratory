package com.sunshine.algorithm.leetcode.jvm.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @date 2020/6/1
 */
@DisplayName("接雨水单元测试")
public class LeetCode42Test {

	@Test
	public void trapTestOne() {
		int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Assertions.assertEquals(6, new LeetCode42().trap(height));
	}

	@Test
	public void trapDoublePointerTestOne() {
		int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Assertions.assertEquals(6, new LeetCode42().trapDoublePointer(height));
	}
}
