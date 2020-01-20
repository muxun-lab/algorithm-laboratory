package com.sunshine.algorithm.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * 加一测试类
 * @author sunshine
 * @date 2020/1/20
 */
public class PlusOneTest {

	@Test
	public void plusOneTestOne() {
		Arrays.stream(new PlusOne().plusOne(new int[]{1, 2, 3})).forEach(System.out::println);
	}

	@Test
	public void plusOneTestTwo() {
		Arrays.stream(new PlusOne().plusOne(new int[]{4, 3, 2, 1})).forEach(System.out::println);
	}

	@Test
	public void plusOneTestThree() {
		Arrays.stream(new PlusOne().plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})).forEach(System.out::println);
	}
}
