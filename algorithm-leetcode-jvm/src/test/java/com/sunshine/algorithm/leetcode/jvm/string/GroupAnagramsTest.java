package com.sunshine.algorithm.leetcode.jvm.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author sunshine
 * @created 2020-02-23
 */
@DisplayName("字母异位词分组")
public class GroupAnagramsTest {

	@Test
	public void groupAnagrams() {
		Assertions.assertIterableEquals(List.of(List.of("eat", "tea", "ate"), List.of("tan", "nat"), List.of("bat")), new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
	}
}
