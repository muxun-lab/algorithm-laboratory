package com.muxun.algorithm.leetcode.lcp.jvm.test.greedy;

import com.muxun.algorithm.leetcode.lcp.jvm.greedy.LCP30;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 题号:
 * 题目:
 * 链接:
 * 详情:
 * @author 慕勋
 * @created 2024/2/6
 */
@DisplayName("魔塔游戏测试用例")
public class LCP30Test {

    @Test
    public void testOne() {
        int[] nums = {100, 100, 100, -250, -60, -140, -50, -50, 100, 150};
        int res = new LCP30().magicTower(nums);
        int expected = 1;
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {-200, -300, 400, 0};
        int res = new LCP30().magicTower(nums);
        int expected = -1;
        Assertions.assertEquals(expected, res);
    }
}
