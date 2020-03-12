package com.sunshine.algorithm.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-12
 */
@DisplayName("最小公倍数单元测试")
public class LeastCommonMultipleTest {

	@Test
	public void leastCommonMultipleTestOne() {
		Assertions.assertEquals(4147, new LeastCommonMultiple().leastCommonMultipleOne(319, 377));
	}
}
