package com.sunshine.algorithm.basic.bfs;

import java.util.LinkedList;

/**
 * 算法基础——广度优先搜索
 * @author sunshine
 * @created 2020-03-10
 */
public class BFS {

	/**
	 * 广度优先搜索代码框架
	 * @param root 根节点
	 */
	public void bfs(TreeNode root) {
		LinkedList<TreeNode> stack = new LinkedList<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode currentNode = stack.pop();
			// 当前节点属于叶子节点，是不合法的状态，继续循环
			if (currentNode.left == null && currentNode.right == null) {
				continue;
			}
			if (currentNode.left != null) {
				stack.push(currentNode.left);
			}
			if (currentNode.right != null) {
				stack.push(currentNode.right);
			}
		}
	}
}
