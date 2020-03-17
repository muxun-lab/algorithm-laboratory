package com.sunshine.algorithm.leetcode.jvm.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-17
 */
@DisplayName("拼写单词单元测试")
public class CountCharactersTest {

	@Test
	public void countCharactersTestOne() {
		Assertions.assertEquals(6, new CountCharacters().countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"));
	}

	@Test
	public void countCharactersTestTwo() {
		Assertions.assertEquals(10, new CountCharacters().countCharacters(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr"));
	}
}
