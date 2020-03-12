package com.sunshine.algorithm.common;

import java.util.Collections;
import java.util.List;

/**
 * 最大公约数（最大公因数）
 * @author sunshine
 * @created 2020-03-12
 */
public class GreatestCommonDivisor {

	/**
	 * 思路：欧几里得算法，又称辗转相除法
	 * @param x 数x
	 * @param y 数y
	 * @return 最大公约数
	 */
	public int gcdOne(int x, int y) {
		int result = 0;
		while (y != 0) {
			result = x % y;
			x = y;
			y = result;
		}
		return x;
	}

	/**
	 * 思路：分解质因数后，求出相同质因数的最大值
	 * @param x 数x
	 * @param y 数y
	 * @return 最大公约数
	 */
	public int gcdTwo(int x, int y) {
		List<Integer> decomposeX = new DecomposePrime().decompose(x);
		List<Integer> decomposeY = new DecomposePrime().decompose(y);
		decomposeX.retainAll(decomposeY);
		return Collections.max(decomposeX);
	}

	/**
	 * 思路：更相减损术
	 * @param x 数x
	 * @param y 数y
	 * @return 最大公约数
	 */
	public int gcdThree(int x, int y) {
		while (x != y) {
			if (x > y) {
				x -= y;
			} else {
				y -= x;
			}
		}
		return x;
	}
}
