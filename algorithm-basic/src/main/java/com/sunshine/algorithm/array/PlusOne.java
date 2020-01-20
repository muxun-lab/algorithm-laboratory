package com.sunshine.algorithm.array;

/**
 * 加一
 * 题目：
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位，数组中每个元素只存储单个数字。
 * 你可以假设除了整数0之外，这个整数不会以零开头。
 * @author sunshine
 * @date 2020/1/20
 */
public class PlusOne {

	/**
	 * 1. 正常情况
	 * 2. 99 => 100
	 * 3. 49 => 50
	 * @param digits 数组
	 * @return +1处理后的数组
	 */
	public int[] plusOne(int[] digits) {
		if (digits.length <= 0) {
			return new int[0];
		}
		StringBuilder temp = new StringBuilder();
		for (int digit : digits) {
			temp.append(digit);
		}
		String tempStr = String.valueOf(Long.parseLong(temp.toString()) + 1);
		int[] result = new int[tempStr.length()];
		for (int i = 0; i < tempStr.length(); i++) {
			result[i] = (int) tempStr.charAt(i) - (int) ('0');
		}
		return result;
	}
}
