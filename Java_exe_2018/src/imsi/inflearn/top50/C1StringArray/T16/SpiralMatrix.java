package imsi.inflearn.top50.C1StringArray.T16;

import java.util.*;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, 
				           { 4, 5, 6 }, 
				           { 7, 8, 9 } };
		System.out.println(solve(matrix));
	}

	public static List<Integer> solve(int[][] matrix) {
		// 1
		List<Integer> result = new ArrayList<>();
		if (matrix == null || matrix.length == 0)
			return result;
		int rowStart = 0;
		int rowEnd = matrix.length - 1;

		int colStart = 0;
		int colEnd = matrix[0].length - 1;

		// ��  00, 01, 02
		//         �� 02, 
		//           12, 
		//           22
		// ��  20, 21, 22
		//   10, 
		// �� 20
		// ��  11 (������)
		// �� ���� ������ �ȵǹǷ�...
		// ��Ģ ã�� **
		while (rowStart <= rowEnd && colStart <= colEnd) {
			// right
			for (int i = colStart; i <= colEnd; i++) {
				result.add(matrix[rowStart][i]);
			}
			rowStart++;
			// down
			for (int i = rowStart; i <= rowEnd; i++) {
				result.add(matrix[i][colEnd]);
			}
			colEnd--;

			// left 3->0
			if (rowStart <= rowEnd) {
				for (int i = colEnd; i >= colStart; i--) {
					result.add(matrix[rowEnd][i]);
				}
			}
			rowEnd--;
			// up 2->1
			if (colStart <= colEnd) {
				if (rowStart <= rowEnd) {
					for (int i = rowEnd; i >= rowStart; i--) {
						result.add(matrix[i][colStart]);
					}
				}
			}
			colStart++;
		}
		return result;

	}
}
