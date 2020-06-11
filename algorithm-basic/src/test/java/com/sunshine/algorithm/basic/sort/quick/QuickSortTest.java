package com.sunshine.algorithm.basic.sort.quick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-05-24
 */
@DisplayName("快速排序单元测试")
public class QuickSortTest {

	@Test
	public void quickSortTestOne() {
		int[] target = new int[]{8, 9, 7, 5, 3, 4, 6, 1, 2};
		new QuickSort().quickSort(target, 0, 8);
		Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, target);
	}
}
