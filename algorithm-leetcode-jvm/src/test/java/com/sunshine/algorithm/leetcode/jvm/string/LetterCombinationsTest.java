package com.sunshine.algorithm.leetcode.jvm.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author sunshine
 * @created 2020-03-06
 */
@DisplayName("电话号码的字母组合测试类")
public class LetterCombinationsTest {

	@Test
	public void letterCombinationsTestOne() {
		Assertions.assertIterableEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), new LetterCombinations().letterCombinations("23"));
	}
}
