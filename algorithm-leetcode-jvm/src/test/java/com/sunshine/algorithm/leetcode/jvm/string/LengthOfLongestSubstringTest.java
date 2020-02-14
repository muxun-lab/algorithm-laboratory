package com.sunshine.algorithm.leetcode.jvm.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-02-11
 */
@DisplayName("无重复字符的最长子串测试类")
public class LengthOfLongestSubstringTest {

	@Test
	public void lengthOfLongestSubstringTestOne() {
		Assertions.assertEquals(3, new LengthOfLongestSubstring().lengthOfLongestSubstring("abcabcbb"));
	}

	@Test
	public void lengthOfLongestSubstringTestTwo() {
		Assertions.assertEquals(1, new LengthOfLongestSubstring().lengthOfLongestSubstring("bbbbb"));
	}

	@Test
	public void lengthOfLongestSubstringTestThree() {
		Assertions.assertEquals(3, new LengthOfLongestSubstring().lengthOfLongestSubstring("pwwkew"));
	}

	@Test
	public void lengthOfLongestSubstringTestFour() {
		Assertions.assertEquals(2, new LengthOfLongestSubstring().lengthOfLongestSubstring("abba"));
	}
}
