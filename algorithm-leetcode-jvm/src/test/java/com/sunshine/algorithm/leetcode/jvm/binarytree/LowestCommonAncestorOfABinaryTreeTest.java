package com.sunshine.algorithm.leetcode.jvm.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @date 2020/6/2
 */
@DisplayName("二叉树的最近公共祖先单元测试")
public class LowestCommonAncestorOfABinaryTreeTest {

	@Test
	public void lowestCommonAncestorTestOne() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
		TreeNode expected = root;
		TreeNode p = root.left;
		TreeNode q = root.right;
		Assertions.assertEquals(root, new LowestCommonAncestorOfABinaryTree().lowestCommonAncestor(root, p, q));
	}

	@Test
	public void lowestCommonAncestorTestTwo() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
		TreeNode expected = root.left;
		TreeNode p = root.left;
		TreeNode q = root.left.right.right;
		Assertions.assertEquals(expected, new LowestCommonAncestorOfABinaryTree().lowestCommonAncestor(root, p, q));
	}

	@Test
	public void lowestCommonAncestorRecursionTestOne() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
		TreeNode expected = root;
		TreeNode p = root.left;
		TreeNode q = root.right;
		Assertions.assertEquals(root, new LowestCommonAncestorOfABinaryTree().lowestCommonAncestorRecursion(root, p, q));
	}

	@Test
	public void lowestCommonAncestorRecursionTestTwo() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
		TreeNode expected = root.left;
		TreeNode p = root.left;
		TreeNode q = root.left.right.right;
		Assertions.assertEquals(expected, new LowestCommonAncestorOfABinaryTree().lowestCommonAncestorRecursion(root, p, q));
	}
}
