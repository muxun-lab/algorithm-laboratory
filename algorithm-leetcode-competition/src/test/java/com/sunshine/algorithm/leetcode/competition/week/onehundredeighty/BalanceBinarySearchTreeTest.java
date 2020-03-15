package com.sunshine.algorithm.leetcode.competition.week.onehundredeighty;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-15
 */
@DisplayName("将二叉搜索树变平衡单元测试")
public class BalanceBinarySearchTreeTest {

	@Test
	public void balanceBinarySearchTreeTestOne() {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(3);
		root.right.right.right = new TreeNode(4);
		System.out.println(new BalanceBinarySearchTree().balanceBST(root));
	}
}
