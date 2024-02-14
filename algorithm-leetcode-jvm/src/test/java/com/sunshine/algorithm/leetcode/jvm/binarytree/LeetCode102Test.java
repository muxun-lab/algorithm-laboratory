package com.sunshine.algorithm.leetcode.jvm.binarytree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * 题号:
 * 题目:
 * 链接:
 * 详情:
 * @author 慕勋
 * @created 2024/2/14
 */
@DisplayName("二叉树的层序遍历测试用例")
public class LeetCode102Test {

    @Test
    public void testOne() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> resList = new LeetCode102().levelOrder(root);
        List<List<Integer>> expected = List.of(List.of(3), List.of(9, 20), List.of(15, 7));
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testTwo() {
        TreeNode root = new TreeNode(1);
        List<List<Integer>> resList = new LeetCode102().levelOrder(root);
        List<List<Integer>> expected = List.of(List.of(1));
        Assertions.assertIterableEquals(expected, resList);
    }

    @Test
    public void testThree() {
        TreeNode root = null;
        List<List<Integer>> resList = new LeetCode102().levelOrder(root);
        List<List<Integer>> expected = List.of();
        Assertions.assertIterableEquals(expected, resList);
    }
}
