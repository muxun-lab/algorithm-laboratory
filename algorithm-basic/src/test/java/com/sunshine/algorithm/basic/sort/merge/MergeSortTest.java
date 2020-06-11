package com.sunshine.algorithm.basic.sort.merge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-05-25
 */
@DisplayName("归并排序单元测试")
public class MergeSortTest {

	@Test
	public void mergeSortTestOne() {
		int[] target = new int[]{8, 9, 7, 5, 3, 4, 6, 1, 2};
		new MergeSort().mergeSort(target, 0, 8);
		Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, target);
	}
}
