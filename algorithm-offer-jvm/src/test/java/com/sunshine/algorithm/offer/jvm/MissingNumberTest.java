package com.sunshine.algorithm.offer.jvm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-16
 */
@DisplayName("0~n-1中缺失的数字")
public class MissingNumberTest {

	@Test
	public void missingNumberTestOne() {
		Assertions.assertEquals(2, new MissingNumber().missingNumber(new int[]{0, 1, 3}));
	}

	@Test
	public void missingNumberTestTwo() {
		Assertions.assertEquals(8, new MissingNumber().missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));
	}

	@Test
	public void missingNumberTestThree() {
		Assertions.assertEquals(2, new MissingNumber().missingNumber(new int[]{0, 1, 3, 4, 5}));
	}
}
