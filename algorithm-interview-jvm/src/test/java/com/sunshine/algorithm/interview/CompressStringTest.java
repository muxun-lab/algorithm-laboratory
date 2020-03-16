package com.sunshine.algorithm.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-16
 */
@DisplayName("字符串压缩单元测试")
public class CompressStringTest {

	@Test
	public void compressStringTestOne() {
		Assertions.assertEquals("a2b1c5a3", new CompressString().compressString("aabcccccaaa"));
	}

	@Test
	public void compressStringTestTwo() {
		Assertions.assertEquals("abbccd", new CompressString().compressString("abbccd"));
	}
}
