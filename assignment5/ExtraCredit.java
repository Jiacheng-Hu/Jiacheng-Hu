package com.assignment5;

import java.util.LinkedList;
import java.util.List;

public class ExtraCredit {
	public static List<Integer> rotateOrder(int[][] matrix) {
		List<Integer> list = new LinkedList<>();
		if (matrix.length == 0)
			return list;
		int listBegin = 0, rowBegin = 0, listEnd = matrix[0].length - 1, rowEnd = matrix.length - 1;
		while (listBegin <= listEnd && rowBegin <= rowEnd) {
			for (int i = listBegin; i <= listEnd; i++) {
				list.add(matrix[rowBegin][i]);
			}
			rowBegin++;
			for (int j = rowBegin; j <= rowEnd; j++) {
				list.add(matrix[j][listEnd]);
			}
			listEnd--;
			if (rowBegin <= rowEnd) {
				for (int i = listEnd; i >= listBegin; i--) {
					list.add(matrix[rowEnd][i]);
				}
				rowEnd--;
			}
			if (listBegin <= listEnd) {
				for (int i = rowEnd; i >= rowBegin; i--) {
					list.add(matrix[i][listBegin]);
				}
				listBegin++;
			}
		}
		return list;
	}
}
