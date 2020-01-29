package com.sunshine.algorithm;

import org.junit.jupiter.api.Test;

/**
 * @author Sunshine
 * @date 2019-08-29
 */
public class DecomposePrimeTest {

	private DecomposePrime decomposePrime = new DecomposePrime();

	@Test
	public void testDecomposeOneTest() {
		this.decomposePrime.decompose(2);
	}

	@Test
	public void testDecomposeTwoTest() {
		this.decomposePrime.decompose(60);
	}
}
