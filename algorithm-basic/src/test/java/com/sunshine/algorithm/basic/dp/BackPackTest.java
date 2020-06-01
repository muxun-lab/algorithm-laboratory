package com.sunshine.algorithm.basic.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @date 2020/6/1
 */
@DisplayName("背包问题单元测试")
public class BackPackTest {

	@Test
	public void chooseBackPackTestOne() {
		int[] wt = {2, 1, 3};
		int[] val = {4, 2, 3};
		Assertions.assertEquals(6, new BackPack().chooseBackPack(3, 4, wt, val));
	}
}
