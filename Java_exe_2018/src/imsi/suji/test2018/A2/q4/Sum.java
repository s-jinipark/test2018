package imsi.suji.test2018.A2.q4;

import java.util.Arrays;

public class Sum {
	/**
	 * �迭�� �����ϴ� ���
	 *
    * @param		inputData		int[][]		�Էµ�����(�������迭)
    * @return						int[][]		���ĵ� �迭
	 */
	public int[][] getSortedArray(int[][] inputData) {
		int[][] sortedArray = null;
		int size = inputData.length;
		sortedArray = new int[size][size];
		////////////////////////������� ���� (1) ---------------->

		// 10 ���� ������ ���� ����
		for (int i=0 ; i< inputData.length ; i++) {
			for (int j=0 ; j< inputData[i].length ; j++) {
				sortedArray[i][j] = inputData[i][j]%10;
			}
		}
		
		// �� ���� ������������ ����
		for (int i=0 ; i< sortedArray.length ; i++) {
			Arrays.sort( sortedArray[i] );
		}
		
		// �� ����  ������������ ����
		
		for (int i=0 ; i< sortedArray.length ; i++) {
			int[] tmp = new int[sortedArray.length];
			for (int j=0 ; j< sortedArray[i].length ; j++) {
				tmp[j] = sortedArray[j][i] ;
			}
			Arrays.sort( tmp );
			for (int j=0 ; j< tmp.length ; j++) {
				sortedArray[j][i] = tmp[j] ;
			}
			
		}	
		///////////////////////////// <-------------- ������� ���� (1)
		return sortedArray;
	}
	
	/**
	 * �迭���� ����ϴ� ���
	 *
    * @param		sortedArray		int[][]		���ĵ� �迭
    * @return						int			�迭��
	 */
	public int getArrSum(int[][] sortedArray) {
		int arrSum = 0;
		int size = sortedArray.length;
		int [][] temp = new int[size][size];
		for(int i=0; i<size; i++) {
			System.arraycopy( sortedArray[i], 0, temp[i], 0, size );
		}
		
		////////////////////////������� ���� (2) ---------------->

		for (int i=0 ; i< sortedArray.length ; i++) {
			for (int j=0 ; j< sortedArray[i].length ; j++) {
				
				// �� �� �� �� ��
				if (i-1 >= 0) {
					if (sortedArray[i][j] == sortedArray[i-1][j] ) {
						temp[i][j] = 0;
						temp[i-1][j] = 0;
					}
				}
				if (i+1 < size) {
					if (sortedArray[i][j] == sortedArray[i+1][j] ) {
						temp[i][j] = 0;
						temp[i+1][j] = 0;
					}
				}
				if (j-1 >= 0) {
					if (sortedArray[i][j] == sortedArray[i][j-1] ) {
						temp[i][j] = 0;
						temp[i][j-1] = 0;
					}
				}
				if (j+1 < size) {
					if (sortedArray[i][j] == sortedArray[i][j+1] ) {
						temp[i][j] = 0;
						temp[i][j+1] = 0;
					}
				}				
			}
		}
		
		// ��� ĭ�� �� ���
		for (int i=0 ; i< temp.length ; i++) {
			for (int j=0 ; j< temp[i].length ; j++) {
				
				arrSum += temp[i][j];
			}
		}
		///////////////////////////// <-------------- ������� ���� (2)
		return arrSum;
	}
}
