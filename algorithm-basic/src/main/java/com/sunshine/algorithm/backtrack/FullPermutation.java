package com.sunshine.algorithm.backtrack;

import java.util.LinkedList;
import java.util.List;

/**
 * 回溯算法——全排列
 * n的全排列
 * @author sunshine
 * @created 2020-02-22
 */
public class FullPermutation {

	private List<List<Integer>> resultList = new LinkedList<>();

	public List<List<Integer>> fullPermutation(int[] nums) {
		// 记录路径
		LinkedList<Integer> backtrackList = new LinkedList<>();
		backtrack(nums, backtrackList);
		return resultList;
	}

	/**
	 * 递归算法
	 * @param nums  路径
	 * @param track 选择列表
	 */
	private void backtrack(int[] nums, LinkedList<Integer> track) {
		// 结束条件触发
		if (track.size() == nums.length) {
			resultList.add(new LinkedList<>(track));
		}
		for (int num : nums) {
			// 排除非法节点
			if (track.contains(num)) {
				continue;
			}
			// 做选择
			track.add(num);
			// 进入下一行
			backtrack(nums, track);
			// 取消选择
			track.removeLast();
		}
	}
}
