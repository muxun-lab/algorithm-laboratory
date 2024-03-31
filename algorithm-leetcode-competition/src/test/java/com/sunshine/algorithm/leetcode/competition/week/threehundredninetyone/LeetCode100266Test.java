package com.sunshine.algorithm.leetcode.competition.week.threehundredninetyone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author 慕勋
 * @created 2024-03-31
 */
@DisplayName("交替子数组计数测试用例")
public class LeetCode100266Test {

    @Test
    public void testOne() {
        int[] nums = {0, 1, 1, 1};
        long expected = 5;
        long res = new LeetCode100266().countAlternatingSubarrays(nums);
        Assertions.assertEquals(expected, res);
    }

    @Test
    public void testTwo() {
        int[] nums = {1, 0, 1, 0};
        long expected = 10;
        long res = new LeetCode100266().countAlternatingSubarrays(nums);
        Assertions.assertEquals(expected, res);
    }
}
