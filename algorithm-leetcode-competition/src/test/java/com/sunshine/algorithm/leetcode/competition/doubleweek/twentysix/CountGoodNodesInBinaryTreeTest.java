package com.sunshine.algorithm.leetcode.competition.doubleweek.twentysix;

import com.sunshine.algorithm.leetcode.competition.week.onehundredeighty.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-05-25
 */
@DisplayName("统计二叉树中好节点的数目单元测试")
public class CountGoodNodesInBinaryTreeTest {

	@Test
	public void goodNodesTestOne() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.left.left = new TreeNode(3);
		root.right.left = new TreeNode(1);
		root.right.right = new TreeNode(5);
		Assertions.assertEquals(4, new CountGoodNodesInBinaryTree().goodNodes(root));
	}

	@Test
	public void goodNodesTestTwo() {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(2);
		Assertions.assertEquals(3, new CountGoodNodesInBinaryTree().goodNodes(root));
	}

	@Test
	public void goodNodesTestThree() {
		TreeNode root = new TreeNode(1);
		Assertions.assertEquals(1, new CountGoodNodesInBinaryTree().goodNodes(root));
	}
}
