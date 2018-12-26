package com.sunshine.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-25 20:23
 */
public class MaxProfitTest {

	private MaxProfit maxProfit;

	@Before
	public void before() {
		this.maxProfit = new MaxProfit();
	}

	@Test
	public void maxProfitTest() {
		Assert.assertEquals(7, this.maxProfit.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
		Assert.assertEquals(4, this.maxProfit.maxProfit(new int[]{1, 2, 3, 4, 5}));
		Assert.assertEquals(0, this.maxProfit.maxProfit(new int[]{7, 6, 4, 3, 1}));
	}
}
