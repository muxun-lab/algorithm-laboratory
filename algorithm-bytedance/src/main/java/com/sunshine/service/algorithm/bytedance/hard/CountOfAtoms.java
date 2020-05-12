package com.sunshine.service.algorithm.bytedance.hard;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/**
 * 题号：726
 * 题目：原子的数量
 * 题链：https://leetcode-cn.com/problems/number-of-atoms/
 * @author sunshine
 * @date 2020/5/12
 */
public class CountOfAtoms {

	/**
	 * 思路：栈
	 * @param formula 化学式
	 * @return 原子的数量
	 */
	public String countOfAtoms(String formula) {
		int n = formula.length();
		Stack<Map<String, Integer>> stack = new Stack<>();
		stack.push(new TreeMap<>());
		for (int i = 0; i < n; ) {
			char current = formula.charAt(i);
			if (current == '(') {
				stack.push(new TreeMap<>());
				i++;
			} else if (current == ')') {
				Map<String, Integer> currentTreeMap = stack.pop();
				int start = ++i, multiplicity = 1;
				// 计算括号内的元素个数及总个数，加入到最外面的元素中
				while (i < n && Character.isDigit(formula.charAt(i))) {
					i++;
				}
				if (i > start) {
					multiplicity = Integer.parseInt(formula.substring(start, i));
				}
				for (String c : currentTreeMap.keySet()) {
					int value = currentTreeMap.get(c);
					stack.peek().put(c, stack.peek().getOrDefault(c, 0) + value * multiplicity);
				}
			} else {
				int start = i++;
				while (i < n && Character.isLowerCase(formula.charAt(i))) {
					i++;
				}
				String name = formula.substring(start, i);
				start = i;
				while (i < n && Character.isDigit(formula.charAt(i))) {
					i++;
				}
				int multiplicity = i > start ? Integer.parseInt(formula.substring(start, i)) : 1;
				stack.peek().put(name, stack.peek().getOrDefault(name, 0) + multiplicity);
			}
		}
		// 最后只会剩下一个TreeMap，也就是把所有的嵌套都进行了归并
		StringBuilder resultBuilder = new StringBuilder();
		for (String name : stack.peek().keySet()) {
			resultBuilder.append(name);
			int multiplicity = stack.peek().get(name);
			if (multiplicity > 1) {
				resultBuilder.append(multiplicity);
			}
		}
		return resultBuilder.toString();
	}
}
