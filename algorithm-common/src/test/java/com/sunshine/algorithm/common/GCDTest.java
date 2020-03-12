package com.sunshine.algorithm.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-12
 */
@DisplayName("最大公约数单元测试")
public class GCDTest {

	@Test
	public void gcdTestOne() {
		Assertions.assertEquals(29, new GreatestCommonDivisor().gcdOne(319, 377));
	}

	@Test
	public void gcdTestTwo() {
		Assertions.assertEquals(29, new GreatestCommonDivisor().gcdTwo(319, 377));
	}

	@Test
	public void gcdTestThree() {
		Assertions.assertEquals(29, new GreatestCommonDivisor().gcdThree(319, 377));
	}
}
