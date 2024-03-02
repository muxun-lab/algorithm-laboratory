package com.sunshine.algorithm.leetcode.jvm.dp;

/**
 * 题号: 2369
 * <p>
 * 链接: <a href="https://leetcode.cn/problems/check-if-there-is-a-valid-partition-for-the-array">检查数组是否存在有效划分</a>
 * <p>
 * 详情: 给你一个下标从 0 开始的整数数组 nums ，你必须将数组划分为一个或多个 连续 子数组。
 * <p>
 * 如果获得的这些子数组中每个都能满足下述条件 之一 ，则可以称其为数组的一种 有效 划分：
 * <p>
 * 1. 子数组 恰 由 2 个相等元素组成，例如，子数组 [2,2] 。
 * <p>
 * 2. 子数组 恰 由 3 个相等元素组成，例如，子数组 [4,4,4] 。
 * <p>
 * 3. 子数组 恰 由 3 个连续递增元素组成，并且相邻元素之间的差值为 1 。例如，子数组 [3,4,5] ，但是子数组 [1,3,5] 不符合要求
 * <p>
 * 如果数组 至少 存在一种有效划分，返回 true ，否则，返回 false 。
 * @author 慕勋
 * @created 2024/3/3
 */
public class LeetCode2369 {

    /**
     * 思路: 动态规划
     * 条件:
     * * 前n-2个元素组成的数组至少存在一个有效划分，后面2个元素相等
     * * 前n-3个元素组成的数组至少存在一个有效划分，后面3个元素相等或者等差数列
     * @param nums 数组
     * @return 是否存在有效成分
     */
    public boolean validPartition(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            if (i >= 2) {
                dp[i] = dp[i - 2] && firstCondition(nums[i - 2], nums[i - 1]);
            }
            if (i >= 3) {
                dp[i] = dp[i] || (dp[i - 3] && (second(nums[i - 3], nums[i - 2], nums[i - 1]) || third(nums[i - 3], nums[i - 2], nums[i - 1])));
            }
        }
        return dp[n];
    }

    public boolean firstCondition(int one, int two) {
        return one == two;
    }

    public boolean second(int one, int two, int three) {
        return one == two && one == three;
    }

    public boolean third(int one, int two, int three) {
        return one + 1 == two && two + 1 == three;
    }
}
