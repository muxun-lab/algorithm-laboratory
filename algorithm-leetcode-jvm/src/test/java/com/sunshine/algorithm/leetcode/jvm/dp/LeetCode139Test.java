package com.sunshine.algorithm.leetcode.jvm.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("LeetCode 139题测试用例")
public class LeetCode139Test {

    @Test
    public void testOne() {
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        Assertions.assertTrue(new LeetCode139().wordBreak("leetcode", wordDict));
    }
}
