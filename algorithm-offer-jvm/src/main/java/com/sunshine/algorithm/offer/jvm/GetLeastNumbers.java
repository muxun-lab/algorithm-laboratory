package com.sunshine.algorithm.offer.jvm;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 题号：面试题40
 * 题目：最小的k个数
 * 详情：输入整数数组arr，找出其中最小的k个数
 * 例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4
 * @author sunshine
 * @created 2020-03-20
 */
public class GetLeastNumbers {

	/**
	 * 思路：大顶堆
	 * @param arr 给定的数组
	 * @param k   找出最小数字的个数
	 * @return 最小的k个数字
	 */
	public int[] getLeastNumbers(int[] arr, int k) {
		if (k <= 0) {
			return new int[0];
		}
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, Comparator.comparingInt(o -> o));
		for (int value : arr) {
			priorityQueue.offer(value);
		}
		int[] resultArray = new int[k];
		for (int i = 0; i < k; i++) {
			if (priorityQueue.isEmpty()) {
				break;
			}
			resultArray[i] = priorityQueue.poll();
		}
		return resultArray;
	}
}
