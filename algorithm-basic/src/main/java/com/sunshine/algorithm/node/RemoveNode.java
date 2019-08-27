package com.sunshine.algorithm.node;

/**
 * 第237题：删除链表中的节点
 * @author Sunshine
 * @date 2019-08-27
 */
public class RemoveNode {

	public void deleteNode(ListNode node) {
		while (node.next != null) {
			node.val = node.next.val;
			node = node.next;
		}
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
