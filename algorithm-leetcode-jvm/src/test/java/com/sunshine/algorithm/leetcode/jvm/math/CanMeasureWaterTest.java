package com.sunshine.algorithm.leetcode.jvm.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-21
 */
@DisplayName("水壶问题单元测试")
public class CanMeasureWaterTest {

	@Test
	public void canMeasureWaterTestOne() {
		Assertions.assertTrue(new CanMeasureWater().canMeasureWater(3, 5, 4));
	}

	@Test
	public void canMeasureWaterTestTwo() {
		Assertions.assertFalse(new CanMeasureWater().canMeasureWater(2, 6, 5));
	}

	@Test
	public void canMeasureWaterGCDTestOne() {
		Assertions.assertTrue(new CanMeasureWater().canMeasureWaterGCD(3, 5, 4));
	}

	@Test
	public void canMeasureWaterGCDTestTwo() {
		Assertions.assertFalse(new CanMeasureWater().canMeasureWaterGCD(2, 6, 5));
	}
}
