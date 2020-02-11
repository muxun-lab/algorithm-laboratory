package com.sunshine.algorithm.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 题号：3
 * 题目：无重复字符的最长子串
 * 详情：给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
 * @author sunshine
 * @created 2020-02-11
 */
public class LengthOfLongestSubstring {

	/**
	 * 思路：字典表的不重复姓
	 * @param s 给定的字符串
	 * @return 无重复字符的最长子串长度
	 */
	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		Map<Character, Integer> tempMap = new HashMap<>();
		int start = 0;
		for (int i = 0; i < s.length(); i++) {
			if (tempMap.containsKey(s.charAt(i))) {
				int previous = tempMap.get(s.charAt(i)) + 1;
				start = Math.max(previous, start);
				tempMap.remove(s.charAt(i));
			}
			tempMap.put(s.charAt(i), i);
			max = Math.max(max, i - start + 1);
		}
		return max;
	}
}
