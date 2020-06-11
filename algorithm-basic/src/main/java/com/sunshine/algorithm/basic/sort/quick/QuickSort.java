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
		if (nums == null || nums.length <= 1 || start >= end) {
			return;
		}
		// 获取标准值的分界线
		int partition = partition(nums, start, end);
		// 对分界线左面数组部分进行递归
		quickSort(nums, start, partition);
		// 对分界线右面数组部分进行递归
		quickSort(nums, partition + 1, end);
	}

	/**
	 * 获取分界线
	 * @param nums  需要排序的数组
	 * @param start 起始索引
	 * @param end   结束索引
	 * @return 分界线
	 */
	public int partition(int[] nums, int start, int end) {
		int selected = nums[start];
		while (start < end) {
			// 必须先移动end指针
			while (start < end && selected <= nums[end]) {
				end--;
			}
			if (start < end) {
				// 移动右面比选定值小的值
				nums[start] = nums[end];
				start++;
			}
			// 在移动start指针
			while (start < end && selected >= nums[start]) {
				start++;
			}
			if (start < end) {
				// 移动左面比选定值大的值
				nums[end] = nums[start];
				end--;
			}
		}
		// 将起始值写回数组
		nums[start] = selected;
		return start;
	}
}
