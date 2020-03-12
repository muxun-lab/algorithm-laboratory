package com.sunshine.algorithm.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 分解质因数
 * @author sunshine
 * @date 2019-08-29
 */
public class DecomposePrime {

	/**
	 * 思路：余数为0，则视为因数
	 * @param n 给定的数
	 * @return 给定的数的因数
	 */
	public List<Integer> decompose(int n) {
		if (n <= 1) {
			return new ArrayList<>();
		}
		List<Integer> nodeList = new ArrayList<>();
		// 1不属于质数
		for (int i = 2; i <= n / 2; i++) {
			// 整除才是因数
			if (n % i == 0) {
				nodeList.add(i);
				n = n / i;
				i = 2;
			}
		}
		// 自己本身也是因数
		nodeList.add(n);
		return nodeList;
	}
}
