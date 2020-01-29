package com.sunshine.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：杨辉三角升级版
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 解法一：动态规划，只保留上一行的数据即可
 * 解法二：公式法，组合公式
 * Cnk = Cn(k-1) * (n - k + 1) / k
 * @author sunshine
 * @created 2020-01-24
 */
public class PascalTriangleUpgrade {

	/**
	 * 组合公式
	 * @param rowIndex 杨辉三角所在的行
	 * @return 指定行的杨辉三角集合
	 */
	public List<Integer> getRow(int rowIndex) {
		List<Integer> currentRowList = new ArrayList<>();
		if (rowIndex < 0) {
			return currentRowList;
		}
		currentRowList.add(1);
		long previous = 1;
		for (int i = 1; i <= rowIndex; i++) {
			long current = previous * (rowIndex - i + 1) / i;
			currentRowList.add((int) current);
			previous = current;
		}
		return currentRowList;
	}
}
