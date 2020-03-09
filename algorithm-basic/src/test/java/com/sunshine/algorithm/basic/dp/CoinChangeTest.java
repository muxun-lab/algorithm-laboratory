package com.sunshine.algorithm.basic.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-09
 */
@DisplayName("凑硬币测试类")
public class CoinChangeTest {

	@Test
	public void coinChangeRecursionTest() {
		int amount = 11;
		int[] coins = new int[]{1, 3, 5};
		Assertions.assertEquals(3, new CoinChange().coinChangeRecursion(amount, coins));
	}

	@Test
	public void coinChangeMemorandumTest() {
		int amount = 11;
		int[] coins = new int[]{1, 3, 5};
		Assertions.assertEquals(3, new CoinChange().coinChangeMemorandum(amount, coins, new int[amount][]));
	}

	@Test
	public void coinsChangeDpTest() {
		int amount = 11;
		int[] coins = new int[]{1, 3, 5};
		Assertions.assertEquals(3, new CoinChange().dp(amount, coins));
	}
}
