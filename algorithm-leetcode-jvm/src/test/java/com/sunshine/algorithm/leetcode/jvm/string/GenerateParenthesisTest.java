package com.sunshine.algorithm.leetcode.jvm.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author sunshine
 * @created 2020-03-13
 */
@DisplayName("括号生成单元测试")
public class GenerateParenthesisTest {

	@Test
	public void generateParenthesisTestOne() {
		List<String> resultList = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
		Assertions.assertTrue(resultList.containsAll(new GenerateParenthesis().generateParenthesis(3)));
	}

	@Test
	public void generateParenthesisUpgradeTestOne() {
		List<String> resultList = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
		Assertions.assertTrue(resultList.containsAll(new GenerateParenthesis().generateParenthesisUpgrade(3)));
	}

	@Test
	public void generateParenthesisBacktrackUpgradeTestOne() {
		List<String> resultList = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
		Assertions.assertTrue(resultList.containsAll(new GenerateParenthesis().generateParenthesisBacktrackUpgrade(3)));
	}
}
