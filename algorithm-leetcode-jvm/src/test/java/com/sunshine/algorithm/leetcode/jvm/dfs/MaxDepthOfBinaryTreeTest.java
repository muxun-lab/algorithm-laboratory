package com.sunshine.algorithm.leetcode.jvm.dfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-03-10
 */
@DisplayName("二叉树的最大深度单元测试")
public class MaxDepthOfBinaryTreeTest {

	@Test
	public void maxDepthOfBinaryTreeTestOne() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		Assertions.assertEquals(3, new MaxDepthOfBinaryTree().maxDepth(root));
	}

	@Test
	public void maxDepthOfBinaryTreeTestTwo() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		Assertions.assertEquals(2, new MaxDepthOfBinaryTree().maxDepth(root));
	}

	@Test
	public void maxDepthOfBinaryTreeTestThree() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		Assertions.assertEquals(3, new MaxDepthOfBinaryTree().maxDepth(root));
	}

	@Test
	public void maxDepthOfBinaryTreeRecursionTestOne() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		Assertions.assertEquals(3, new MaxDepthOfBinaryTree().maxDepthRecursion(root));
	}

	@Test
	public void maxDepthOfBinaryTreeRecursionTestTwo() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		Assertions.assertEquals(2, new MaxDepthOfBinaryTree().maxDepthRecursion(root));
	}

	@Test
	public void maxDepthOfBinaryTreeRecursionTestThree() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		Assertions.assertEquals(3, new MaxDepthOfBinaryTree().maxDepthRecursion(root));
	}
}
