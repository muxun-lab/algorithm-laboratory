package com.sunshine.algorithm.leetcode.jvm.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-14
 */
@DisplayName("最长上升子序列单元测试")
public class LengthOfLongestIncreasingSubsequenceTest {

	@Test
	public void lengthOfLISTestOne() {
		Assertions.assertEquals(4, new LengthOfLongestIncreasingSubsequence().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
	}

	@Test
	public void lengthOfLISUpgradeTestOne() {
		Assertions.assertEquals(4, new LengthOfLongestIncreasingSubsequence().lengthOfLISUpgrade(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
	}
}
