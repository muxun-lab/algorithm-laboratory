package com.sunshine.algorithm.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 分解质因数
 * @author sunshine
 * @date 2019-08-29
 */
public class DecomposePrime {

	public void decompose(int n) {
		if (n <= 1) {
			return;
		}
		List<Integer> nodeList = new ArrayList<>();
		for (int i = 2; i <= n / 2; i++) {
			// 整除才是因数
			if (n % i == 0) {
				nodeList.add(i);
				n = n / i;
				i = 2;
			}
		}
		nodeList.add(n);
		for (Integer integer : nodeList) {
			System.out.println(integer);
		}
	}
}
