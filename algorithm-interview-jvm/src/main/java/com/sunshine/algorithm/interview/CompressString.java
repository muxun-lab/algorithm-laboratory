package com.sunshine.algorithm.interview;

/**
 * 题号：面试题01.06
 * 题目：字符串压缩
 * 详情：利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能
 * 比如，字符串aabcccccaaa会变为a2b1c5a3
 * 若“压缩”后的字符串没有变短，则返回原先的字符串
 * 你可以假设字符串中只包含大小写英文字母（a至z）
 * @author sunshine
 * @created 2020-03-16
 */
public class CompressString {

	/**
	 * 思路：迭代
	 * 难点在于需要对字符串进行append()和不是s = s + a开辟新内存
	 * 一个是数组扩容，一个是出申请一块新内存
	 * @param S 需要压缩的字符串
	 * @return 压缩有的字符串
	 */
	public String compressString(String S) {
		if (S.length() <= 1) {
			return S;
		}
		StringBuilder resultBuilder = new StringBuilder();
		int count = 1;
		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(i - 1) == S.charAt(i)) {
				count++;
			} else {
				resultBuilder.append(S.charAt(i - 1)).append(count);
				count = 1;
			}
		}
		resultBuilder.append(S.charAt(S.length() - 1)).append(count);
		if (S.length() <= resultBuilder.length()) {
			return S;
		}
		return resultBuilder.toString();
	}
}
