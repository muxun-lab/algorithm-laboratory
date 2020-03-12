package com.sunshine.algorithm.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Sunshine
 * @date 2019-08-29
 */
public class DecomposePrimeTest {

	@Test
	public void testDecomposeOneTest() {
		Assertions.assertIterableEquals(List.of(2), new DecomposePrime().decompose(2));
	}

	@Test
	public void testDecomposeTwoTest() {
		Assertions.assertIterableEquals(List.of(2, 3, 5, 2), new DecomposePrime().decompose(60));
	}
}
