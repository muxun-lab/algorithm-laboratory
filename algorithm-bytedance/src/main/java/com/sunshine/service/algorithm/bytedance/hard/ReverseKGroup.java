package com.sunshine.service.algorithm.bytedance.hard;

/**
 * 题号：25
 * 题目：K个一组翻转链表
 * 题链：https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
 * 详情：
 * @author sunshine
 * @created 2020-05-12
 */
public class ReverseKGroup {

	/**
	 * 思路：k个一组进行翻转，如果end提前为null，则直接返回结果
	 * @param head
	 * @param k
	 * @return
	 */
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode pre = dummy;
		ListNode end = dummy;
		while (end.next != null) {
			for (int i = 0; i < k && end != null; i++) {
				end = end.next;
			}
			if (end == null) {
				break;
			}
			ListNode start = pre.next;
			ListNode next = end.next;
			end.next = null;
			pre.next = reverse(start);
			start.next = next;
			pre = start;
			end = pre;
		}
		return dummy.next;
	}

	/**
	 * 翻转局部链表
	 * @param head
	 * @return
	 */
	private ListNode reverse(ListNode head) {
		ListNode pre = null;
		ListNode current = head;
		while (current != null) {
			ListNode next = current.next;
			current.next = pre;
			pre = current;
			current = next;
		}
		return pre;
	}
}
