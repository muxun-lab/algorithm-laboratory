package com.sunshine.algorithm.leetcode.jvm.dp;

import java.util.List;

/**
 * 题号：139
 * 题目：单词拆分
 * 详情：给你一个字符串 s 和一个字符串列表 wordDict 作为字典。请你判断是否可以利用字典中出现的单词拼接出 s 。
 * 注意：不要求字典中出现的单词全部都使用，并且字典中的单词可以重复使用。
 * @author valverde
 * @created 2023-04-22
 */
public class LeetCode139 {

    /**
     * 思路：动态规划
     * 思路：dp[i]
     * 转移方程：dp[i] = dj[j] && s[j+1, i]
     * @param s 字符串
     * @param wordDict 字典
     * @return 是否可以通过字典拼成字符串
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict.contains(s)) {
            return true;
        }
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
