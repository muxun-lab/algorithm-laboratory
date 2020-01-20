package com.sunshine.algorithm.array;

import org.junit.Test;

/**
 * 搜索传入位置测试类
 * @author sunshine
 * @date 2020/1/20
 */
public class SearchInsertTest {

	@Test
	public void searchInsertTestOne() {
		System.out.println(new SearchInsert().searchInsert(new int[]{1, 3, 5, 6}, 5));
	}

	@Test
	public void searchInsertTestTwo() {
		System.out.println(new SearchInsert().searchInsert(new int[]{1, 3, 5, 6}, 2));
	}

	@Test
	public void searchInsertTestThree() {
		System.out.println(new SearchInsert().searchInsert(new int[]{1, 3, 5, 6}, 7));
	}

	@Test
	public void searchInsertTestFour() {
		System.out.println(new SearchInsert().searchInsert(new int[]{1, 3, 5, 6}, 0));
	}
}
