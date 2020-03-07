package com.sunshine.algorithm.offer.jvm;

import java.util.LinkedList;

/**
 * 题号：59
 * 题目：队列的最大值
 * 详情：请定义一个队列并实现函数 max_value 得到队列里的最大值
 * 要求函数max_value、push_back 和 pop_front 的时间复杂度都是O(1)。
 * <p>
 * 若队列为空，pop_front 和 max_value 需要返回 -1。
 * <p>
 * 限制：
 * * 1 <= push_back,pop_front,max_value的总操作数 <= 10000
 * * 1 <= value <= 10^5
 * <p>
 * 思路：队列
 * 优解思路：滑动窗口
 * @author sunshine
 * @created 2020-03-07
 */
public class MaxValueOfTheQueue {

	private LinkedList<Integer> valueQueue = new LinkedList<>();

	private LinkedList<Integer> maxValueQueue = new LinkedList<>();

	public MaxValueOfTheQueue() {

	}

	public int max_value() {
		if (maxValueQueue.isEmpty()) {
			return -1;
		}
		return maxValueQueue.getFirst();
	}

	public void push_back(int value) {
		valueQueue.add(value);
		// 队首的值比较大，队尾的值比较小，直接将尾部的删掉，把插入的值找到合适的位置写入
		while (!maxValueQueue.isEmpty() && value > maxValueQueue.getLast()) {
			maxValueQueue.removeLast();
		}
		maxValueQueue.add(value);
	}

	public int pop_front() {
		if (valueQueue.isEmpty()) {
			return -1;
		}
		int result = valueQueue.removeFirst();
		if (maxValueQueue.getFirst() == result) {
			maxValueQueue.removeFirst();
		}
		return result;
	}
}
