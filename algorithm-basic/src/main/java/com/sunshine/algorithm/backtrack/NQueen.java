package com.sunshine.algorithm.backtrack;

import java.util.Arrays;

/**
 * 回溯算法——N皇后问题
 * @author sunshine
 * @created 2020-02-22
 */
public class NQueen {

	public int[][] solveNQueens(int n) {
		int[][] board = new int[8][8];
		backtrack(n, 0, board);
		return board;
	}

	private void backtrack(int n, int k, int[][] board) {
		// 找到解
		if (k >= n) {
			out(board);
			return;
		}
		for (int i = 0; i < n; i++) {
			if (!isOK(k, i, board)) {
				continue;
			}
			board[k][i] = 1;
			backtrack(n, k + 1, board);
			// 撤回选择
			board[k][i] = 0;
		}
	}

	/**
	 * 判断皇后棋子是否OK
	 * @return 该位置是否可以防止皇后
	 */
	private boolean isOK(int line, int col, int[][] board) {
		// 检查列是否有皇后，比如第4列是否有皇后
		for (int i = 0; i < line; i++) {
			if (board[i][col] == 1) {
				return false;
			}
		}
		// 检查左对角线是否有皇后
		for (int m = line - 1, n = col - 1; m >= 0 && n >= 0; m--, n--) {
			if (board[m][n] == 1) {
				return false;
			}
		}
		// 检查右对角线是否有皇后
		for (int m = line - 1, n = col + 1; m >= 0; m--, n++) {
			if (board[m][n] == 1) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 输出
	 * @param board 棋盘
	 */
	public void out(int[][] board) {
		for (int[] ints : board) {
			System.out.println(Arrays.toString(ints));
		}
	}
}
