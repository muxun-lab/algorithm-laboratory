package com.sunshine.algorithm.leetcode.jvm.binarytree;

import java.util.LinkedList;

/**
 * 题号：226
 * 题目：翻转二叉树
 * 题链：https://leetcode-cn.com/problems/invert-binary-tree/
 * 详情：翻转一棵二叉树
 * @author sunshine
 * @created 2020-05-21
 */
public class InvertTree {

	/**
	 * 思路：迭代
	 * @param root 需要反转的二叉树
	 * @return 反转之后的二叉树
	 */
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode current = queue.pop();
			TreeNode temp = current.left;
			current.left = current.right;
			current.right = temp;
			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}
		return root;
	}

	/**
	 * 思路：递归
	 * @param root 需要反转的二叉树
	 * @return 反转之后的二叉树
	 */
	public TreeNode invertTreeRecursion(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		invertTreeRecursion(root.left);
		invertTreeRecursion(root.right);
		return root;
	}
}
