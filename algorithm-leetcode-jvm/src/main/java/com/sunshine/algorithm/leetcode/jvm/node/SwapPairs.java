package com.sunshine.algorithm.leetcode.jvm.node;

/**
 * 题号：24
 * 题目：两两交换链表中的节点
 * 详情：给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * @author sunshine
 * @created 2020-03-12
 */
public class SwapPairs {

	/**
	 * 思路：迭代
	 * @param head 给定链表的头节点
	 * @return 两两交换后的链表头节点
	 */
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode p = head;
		ListNode q = head.next;
		ListNode appendListNode = new ListNode(0);
		appendListNode.next = head;
		ListNode r = appendListNode;
		while (p != null && q != null) {
			ListNode temp = new ListNode(q.val);
			// p和q用于交换节点
			// r用于存储上一次交换的末尾节点
			p.next = q.next;
			q.next = p;
			r.next = temp;
			r.next.next = p;
			p = p.next;
			r = r.next.next;
			q = (p != null) ? p.next : p;
		}
		return appendListNode.next;
	}

	/**
	 * 思路：递归
	 * @param head 给定链表的头节点
	 * @return 两两交换后的链表头节点
	 */
	public ListNode swapPairsRecursion(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		// 1 2举例
		// q = 2 -> null
		ListNode q = head.next;
		// head = 1 -> 2变为 1 -> null
		head.next = swapPairsRecursion(q.next);
		// q = 2 -> 1 -> null
		q.next = head;
		return q;
	}
}
