package com.sunshine.algorithm.offer.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 题号：面试题57
 * 题目：和为s的连续正数序列
 * 详情：输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 * @author sunshine
 * @created 2020-03-06
 */
public class FindContinuousSequence {

	/**
	 * 思路：排序
	 * @param target 给定的目标值
	 * @return 满足和为目标值的正整数序列数组
	 */
	public int[][] findContinuousSequence(int target) {
		if (target < 1) {
			return new int[0][0];
		}
		List<List<Integer>> resultList = new ArrayList<>();
		for (int i = 1; i <= target / 2 + 1; i++) {
			int delta = target - i;
			boolean flag = false;
			List<Integer> currentList = new ArrayList<>();
			currentList.add(i);
			for (int j = i + 1; j <= target / 2 + 1; j++) {
				delta -= j;
				if (delta < 0) {
					break;
				}
				currentList.add(j);
				if (delta == 0) {
					flag = true;
					break;
				}
			}
			if (flag) {
				resultList.add(currentList);
			}
		}
		int[][] resultArray = new int[resultList.size()][];
		for (int i = 0; i < resultList.size(); i++) {
			List<Integer> tempList = resultList.get(i);
			int[] tempArray = new int[tempList.size()];
			for (int j = 0; j < tempList.size(); j++) {
				tempArray[j] = tempList.get(j);
			}
			resultArray[i] = tempArray;
		}
		return resultArray;
	}

	/**
	 * 思路：滑动窗口
	 * @param target 给定的目标值
	 * @return 满足和为目标值的正整数序列数组
	 */
	public int[][] findContinuousSequenceUpgrade(int target) {
		if (target < 1) {
			return new int[0][0];
		}
		int start = 1, end = 1;
		int sum = 0;
		List<int[]> resultList = new ArrayList<>();
		while (start <= target / 2) {
			if (sum < target) {
				sum += end;
				end++;
			} else if (sum > target) {
				sum -= start;
				start++;
			} else {
				int[] tempArray = new int[end - start];
				for (int i = start; i < end; i++) {
					tempArray[i - start] = i;
				}
				resultList.add(tempArray);
				sum -= start;
				start++;
			}
		}
		return resultList.toArray(new int[resultList.size()][]);
	}
}
