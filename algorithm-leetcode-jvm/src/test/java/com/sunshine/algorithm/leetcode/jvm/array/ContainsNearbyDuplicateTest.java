package com.sunshine.algorithm.leetcode.jvm.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-01-29
 */
@DisplayName("存在重复元素II测试类")
public class ContainsNearbyDuplicateTest {

	@Test
	public void containsNearbyDuplicateTestOne() {
		Assertions.assertTrue(new ContainsNearbyDuplicate().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
	}

	@Test
	public void containsNearbyDuplicateTestTwo() {
		Assertions.assertTrue(new ContainsNearbyDuplicate().containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
	}

	@Test
	public void containsNearbyDuplicateTestThree() {
		Assertions.assertFalse(new ContainsNearbyDuplicate().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
	}

	@Test
	public void containsNearbyDuplicateTestFour() {
		Assertions.assertTrue(new ContainsNearbyDuplicate().containsNearbyDuplicate(new int[]{99, 99}, 2));
	}
}
