package com.sunshine.algorithm.leetcode.jvm.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-07
 */
@DisplayName("回文数测试类")
public class IntegerIsPalindromeTest {

	@Test
	public void integerIsPalindromeTestOne() {
		Assertions.assertTrue(new IntegerIsPalindrome().isPalindrome(121));
	}

	@Test
	public void integerIsPalindromeTestTwo() {
		Assertions.assertFalse(new IntegerIsPalindrome().isPalindrome(-121));
	}

	@Test
	public void integerIsPalindromeUpgradeTestOne() {
		Assertions.assertTrue(new IntegerIsPalindrome().isPalindromeUpgrade(121));
	}

	@Test
	public void integerIsPalindromeUpgradeTestTwo() {
		Assertions.assertFalse(new IntegerIsPalindrome().isPalindromeUpgrade(-121));
	}
}
