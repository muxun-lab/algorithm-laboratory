package com.sunshine.algorithm.leetcode.jvm.node;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-17
 */
@DisplayName("删除排序链表中的重复元素II单元测试")
public class DeleteDuplicatesTest {

	@Test
	public void deleteDuplicatesTestOne() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(5);
		ListNode result = new ListNode(1);
		result.next = new ListNode(2);
		result.next.next = new ListNode(5);
		head = new DeleteDumplicates().deleteDuplicates(head);
		while (head != null) {
			Assertions.assertEquals(result.val, head.val);
			result = result.next;
			head = head.next;
		}
	}

	@Test
	public void deleteDuplicatesTestTwo() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(3);
		ListNode result = new ListNode(2);
		result.next = new ListNode(3);
		head = new DeleteDumplicates().deleteDuplicates(head);
		while (head != null) {
			Assertions.assertEquals(result.val, head.val);
			result = result.next;
			head = head.next;
		}
	}

	@Test
	public void deleteDuplicatesDoublePointerTestOne() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(5);
		ListNode result = new ListNode(1);
		result.next = new ListNode(2);
		result.next.next = new ListNode(5);
		head = new DeleteDumplicates().deleteDuplicatesDoublePointer(head);
		while (head != null) {
			Assertions.assertEquals(result.val, head.val);
			result = result.next;
			head = head.next;
		}
	}

	@Test
	public void deleteDuplicatesDoublePointerTestTwo() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(3);
		ListNode result = new ListNode(2);
		result.next = new ListNode(3);
		head = new DeleteDumplicates().deleteDuplicatesDoublePointer(head);
		while (head != null) {
			Assertions.assertEquals(result.val, head.val);
			result = result.next;
			head = head.next;
		}
	}

	@Test
	public void deleteDuplicatesDoublePointerTestThree() {
		ListNode head = new ListNode(-3);
		head.next = new ListNode(-3);
		head.next.next = new ListNode(-2);
		head.next.next.next = new ListNode(-1);
		head.next.next.next.next = new ListNode(-1);
		head.next.next.next.next.next = new ListNode(0);
		head.next.next.next.next.next.next = new ListNode(0);
		head.next.next.next.next.next.next.next = new ListNode(0);
		head.next.next.next.next.next.next.next.next = new ListNode(0);
		ListNode result = new ListNode(-2);
		head = new DeleteDumplicates().deleteDuplicatesDoublePointer(head);
		while (head != null) {
			Assertions.assertEquals(result.val, head.val);
			result = result.next;
			head = head.next;
		}
	}

	@Test
	public void deleteDuplicatesRecursionTestOne() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(5);
		ListNode result = new ListNode(1);
		result.next = new ListNode(2);
		result.next.next = new ListNode(5);
		head = new DeleteDumplicates().deleteDuplicatesRecursion(head);
		while (head != null) {
			Assertions.assertEquals(result.val, head.val);
			result = result.next;
			head = head.next;
		}
	}

	@Test
	public void deleteDuplicatesRecursionTestTwo() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(3);
		ListNode result = new ListNode(2);
		result.next = new ListNode(3);
		head = new DeleteDumplicates().deleteDuplicatesRecursion(head);
		while (head != null) {
			Assertions.assertEquals(result.val, head.val);
			result = result.next;
			head = head.next;
		}
	}
}
