package com.sunshine.algorithm.basic.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2020-03-09
 */
@DisplayName("凑硬币测试用例")
public class LeetCode322Test {

	@Test
	public void coinChangeRecursionTest() {
		int amount = 11;
		int[] coins = new int[]{1, 3, 5};
		int expected = 3;
		int res = new LeetCode322().coinChangeByRecursion(amount, coins);
		Assertions.assertEquals(expected, res);
	}

	@Test
	public void coinChangeMemorandumTest() {
		int amount = 11;
		int[] coins = new int[]{1, 3, 5};
		int expected = 3;
		int res = new LeetCode322().coinChangeByMemorandum(amount, coins, new int[amount][]);
		Assertions.assertEquals(expected, res);
	}

	@Test
	public void coinsChangeDpTest() {
		int amount = 11;
		int[] coins = new int[]{1, 3, 5};
		int expected = 3;
		int res = new LeetCode322().coinChangeByDP(amount, coins);
		Assertions.assertEquals(expected, res);
	}
}
