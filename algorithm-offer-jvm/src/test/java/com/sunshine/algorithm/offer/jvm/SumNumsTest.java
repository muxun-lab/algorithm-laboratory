package com.sunshine.algorithm.offer.jvm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @date 2020/6/2
 */
@DisplayName("求1+2+…+n单元测试")
public class SumNumsTest {

	@Test
	public void sumNumsTestOne() {
		Assertions.assertEquals(6, new SumNums().sumNums(3));
	}

	@Test
	public void sumNumsTestTwo() {
		Assertions.assertEquals(45, new SumNums().sumNums(9));
	}
}
