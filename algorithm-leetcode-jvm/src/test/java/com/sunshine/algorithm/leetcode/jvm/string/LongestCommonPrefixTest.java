package com.sunshine.algorithm.leetcode.jvm.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-02-17
 */
@DisplayName("最长公共前缀测试类")
public class LongestCommonPrefixTest {

	@Test
	public void longestCommonPrefixTestOne() {
		Assertions.assertEquals("fl", new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
	}

	@Test
	public void longestCommonPrefixTestTwo() {
		Assertions.assertEquals("", new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
	}
}
