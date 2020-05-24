package com.sunshine.algorithm.basic.sort.merge;

/**
 * 基础算法——归并排序
 * @author sunshine
 * @created 2020-05-16
 */
public class MergeSort {

	/**
	 * 思路：分治思想
	 * @param nums  给定数组
	 * @param start 迭代的起始指针
	 * @param end   迭代的结束指针
	 */
	public void mergeSort(int[] nums, int start, int end) {
		int middle = (start + end) >>> 1;
		if (start < end) {
			mergeSort(nums, start, middle);
			mergeSort(nums, middle + 1, end);
			merge(nums, start, middle, end);
		}
	}

	public void merge(int[] nums, int start, int middle, int end) {
		// 合并数组
		int[] temp = new int[end - start + 1];
		int i = start;
		int j = middle + 1;
		// 合并数组指针
		int k = 0;
		while (i <= middle && j <= end) {
			if (nums[i] < nums[j]) {
				temp[k++] = nums[i++];
			} else {
				temp[k++] = nums[j++];
			}
		}
		// 将剩余部分放回到数组中
		while (i <= middle) {
			temp[k++] = nums[i++];
		}
		while (j <= end) {
			temp[k++] = nums[j++];
		}
		// 将temp数组的元素写回到nums中
		if (temp.length >= 0) {
			System.arraycopy(temp, 0, nums, start, temp.length);
		}
	}
}
