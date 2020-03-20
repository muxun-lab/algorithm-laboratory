package com.sunshine.algorithm.offer.jvm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-20
 */
@DisplayName("最小的k个数单元测试")
public class GetLeastNumbersTest {

	@Test
	public void getLeastNumbersTestOne() {
		Assertions.assertArrayEquals(new int[]{1, 2, 3, 4}, new GetLeastNumbers().getLeastNumbers(new int[]{4, 5, 1, 6, 2, 7, 3, 8}, 4));
	}

	@Test
	public void getLeastNumbersTestTwo() {
		Assertions.assertArrayEquals(new int[]{1, 2}, new GetLeastNumbers().getLeastNumbers(new int[]{3, 2, 1}, 2));
	}

	@Test
	public void getLeastNumbersTestThree() {
		Assertions.assertArrayEquals(new int[]{0}, new GetLeastNumbers().getLeastNumbers(new int[]{0, 1, 2, 1}, 1));
	}
}
