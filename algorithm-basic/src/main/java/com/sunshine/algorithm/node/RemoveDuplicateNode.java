package com.sunshine.algorithm.node;

/**
 * 第203题：移除链表重复元素
 * @author Sunshine
 * @date 2019-08-27
 */
public class RemoveDuplicateNode {

	public ListNode removeElements(ListNode head, int val) {
		ListNode header = new ListNode(0);
		header.next = head;
		ListNode lastNode = null;
		while (head != null) {
			if (head.val == val) {
				if (lastNode != null) {
					lastNode.next = head.next;
				} else {
					header.next = head.next;
				}
			} else {
				lastNode = head;
			}
			head = head.next;
		}
		return header.next;
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
