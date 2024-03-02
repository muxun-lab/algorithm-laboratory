package com.sunshine.algorithm.basic.sort.quick;

/**
 * 基础算法——快速排序
 * @author sunshine
 * @created 2020-05-16
 */
public class QuickSort {

	/**
	 * 思路：递归
	 * @param nums  需要排序的数组
	 * @param start 起始索引
	 * @param end   结束索引
	 */
	public void quickSort(int[] nums, int start, int end) {
		int partition = partition(nums, start, end);
		quickSort(nums, start, partition - 1);
		quickSort(nums, partition + 1, end);
	}

	private int partition(int[] nums, int left, int right) {
		int selected = nums[left];
		while (left < right) {
			while (left < right && selected <= nums[right]) {
				right--;
			}
			if (left < right) {
				nums[left] = nums[right];
				left++;
			}
			while (left < right && selected >= nums[left]) {
				nums[right] = nums[left];
				right--;
			}
		}
		nums[left] = selected;
		return left;
	}
}
