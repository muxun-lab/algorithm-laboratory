package com.sunshine.algorithm.offer.jvm;

/**
 * 题号：面试题64
 * 题目：求1+2+...+n
 * 题链：https://leetcode-cn.com/problems/qiu-12n-lcof/
 * 详情：求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 * @author sunshine
 * @date 2020/6/2
 */
public class SumNums {

	/**
	 * 思路：DFS
	 * @param n 给定的数
	 * @return n个数之和
	 */
	public int sumNums(int n) {
		return dfs(n, 0);
	}

	public int dfs(int n, int sum) {
		if (n == 0) {
			return sum;
		}
		return dfs(n - 1, sum + n);
	}
}
