package com.sunshine.algorithm.leetcode.jvm.node;

/**
 * 题号：19
 * 题目：删除链表的倒数第N个节点
 * 详情：给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * @author sunshine
 * @created 2020-02-14
 */
public class RemoveNthFromEnd {

	/**
	 * 思路：双指针
	 * 分别需要处理两次边界问题
	 * @param head 给定的链表
	 * @param n    需要删除的倒数数
	 * @return 链表的头结点
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode result = new ListNode(0);
		result.next = head;
		ListNode startNode = result;
		ListNode endNode = result;
		int distance = n;
		while (endNode.next != null) {
			endNode = endNode.next;
			if (distance == 0) {
				startNode = startNode.next;
			} else {
				distance--;
			}
		}
		startNode.next = startNode.next.next;
		return result.next;
	}

	/**
	 * 思路：两次循环
	 * 分别需要处理两次边界问题
	 * @param head 给定的链表
	 * @param n    需要删除的倒数数
	 * @return 链表的头结点
	 */
	public ListNode removeNthFromEndOld(ListNode head, int n) {
		ListNode result = head;
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		if (count == 1) {
			return null;
		}
		int deleteIndex = count - n;
		if (deleteIndex < 0) {
			return result;
		}
		if (deleteIndex == 0) {
			return result.next;
		}
		head = result;
		while (--deleteIndex > 0) {
			head = head.next;
		}
		if (n == 1) {
			head.next = null;
		} else {
			head.next = head.next.next;
		}
		return result;
	}
}
