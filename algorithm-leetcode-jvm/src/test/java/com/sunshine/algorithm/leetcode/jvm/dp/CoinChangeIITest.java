package com.sunshine.algorithm.leetcode.jvm.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @date 2020/6/1
 */
@DisplayName("零钱兑换 II单元测试")
public class CoinChangeIITest {

	@Test
	public void changeTestOne() {
		int[] coins = {1, 2, 5};
		Assertions.assertEquals(4, new CoinChangeII().change(5, coins));
	}

	@Test
	public void changeTestTwo() {
		int[] coins = {2};
		Assertions.assertEquals(0, new CoinChangeII().change(3, coins));
	}

	@Test
	public void changeTestThree() {
		int[] coins = {10};
		Assertions.assertEquals(1, new CoinChangeII().change(10, coins));
	}

	@Test
	public void changeTestFour() {
		int[] coins = {};
		Assertions.assertEquals(1, new CoinChangeII().change(0, coins));
	}
}
