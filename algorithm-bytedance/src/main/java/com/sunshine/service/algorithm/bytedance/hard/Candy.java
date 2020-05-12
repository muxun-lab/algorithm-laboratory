package com.sunshine.service.algorithm.bytedance.hard;

import java.util.Arrays;

/**
 * 题号：135
 * 题目：分发糖果
 * 题链：https://leetcode-cn.com/problems/candy/
 * 详情：
 * @author sunshine
 * @date 2020/5/12
 */
public class Candy {

	public int candy(int[] ratings) {
		int[] candies = new int[ratings.length];
		Arrays.fill(candies, 1);
		boolean flag = true;
		int sum = 0;
		while (flag) {
			for (int i = 0; i < ratings.length; i++) {
				if (i != ratings.length - 1 && ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
					candies[i] = candies[i + 1] + 1;
					flag = true;
				}
				if (i > 0 && ratings[i] > ratings[i - 1] && candies[i] <= candies[i - 1]) {
					candies[i] = candies[i - 1] + 1;
				}
			}
		}
		for (int candy : candies) {
			sum += candy;
		}
		return sum;
	}
}
