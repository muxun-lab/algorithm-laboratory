package com.sunshine.algorithm.leetcode.jvm.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 题号：17
 * 题目：电话号码的字母组合
 * 详情：给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射如下（与电话按键相同）。
 * 注意 1 不对应任何字母。
 * <p>
 * 说明：尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 * @author sunshine
 * @created 2020-03-06
 */
public class LetterCombinations {

	private Map<Integer, String> integerStringMap = new HashMap<>();

	/**
	 * 思路：Hash
	 * @param digits 给定的数字字符串
	 * @return 九宫格的字母组合情况
	 */
	public List<String> letterCombinations(String digits) {
		LinkedList<String> resultList = new LinkedList<>();
		if (digits.length() <= 0) {
			return resultList;
		}
		integerStringMap.put(2, "abc");
		integerStringMap.put(3, "def");
		integerStringMap.put(4, "ghi");
		integerStringMap.put(5, "jkl");
		integerStringMap.put(6, "mno");
		integerStringMap.put(7, "pgrs");
		integerStringMap.put(8, "tuv");
		integerStringMap.put(9, "wxyz");
		backtrack(digits, resultList, 0, "");
		return resultList;
	}

	private void backtrack(String digits, LinkedList<String> backtrackList, int start, String backtrack) {
		if (backtrack.length() == digits.length()) {
			backtrackList.add(backtrack.toString());
			return;
		}
		if (start >= digits.length()) {
			return;
		}
		String stringMap = integerStringMap.get(Integer.parseInt(String.valueOf(digits.charAt(start))));
		for (int i = 0; i < stringMap.length(); i++) {
			String current = String.valueOf(stringMap.charAt(i));
			backtrack += current;
			backtrack(digits, backtrackList, start + 1, backtrack);
			backtrack = backtrack.substring(0, backtrack.length() - 1);
		}
	}
}
