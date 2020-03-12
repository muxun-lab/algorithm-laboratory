package com.sunshine.algorithm.common;

/**
 * 最小公倍数
 * @author sunshine
 * @created 2020-03-12
 */
public class LeastCommonMultiple {

	/**
	 * 思路：给定的两个数的乘积等于最大公约数和最小公倍数的乘积
	 * (x * y) * [a, b] = a * b
	 * @param x 数一
	 * @param y 数二
	 * @return 数一数二的最小公倍数
	 */
	public int leastCommonMultipleOne(int x, int y) {
		return x * y / new GreatestCommonDivisor().gcdOne(x, y);
	}
}
