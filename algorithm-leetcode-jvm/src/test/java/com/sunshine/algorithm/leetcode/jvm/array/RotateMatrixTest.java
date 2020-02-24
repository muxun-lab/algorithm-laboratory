package com.sunshine.algorithm.leetcode.jvm.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sunshine
 * @created 2020-02-24
 */
@DisplayName("旋转图像测试类")
public class RotateMatrixTest {

	@Test
	public void rotateTestOne() {
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] result = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		new RotateMatrix().rotate(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				Assertions.assertEquals(result[i][j], matrix[i][j]);
			}
		}
	}

	@Test
	public void rotateTestTwo() {
		int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
		int[][] result = {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
		new RotateMatrix().rotate(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				Assertions.assertEquals(result[i][j], matrix[i][j]);
			}
		}
	}
}
