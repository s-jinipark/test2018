package imsi.suji.test2018.A1.q4;

public class Aggregate {
	/**
	 * �κ� �迭�� ������ ���ϴ� ���
	 *
	 * @param arraySize int �迭 ũ��
	 * @return int �κ� �迭�� ����
	 */
	public int getNumberOfSubArrays(int arraySize) {
		int numberOfSubArrays = 0;
		//////////////////////// ������� ���� (1) ---------------->
		for (int i = 0; i < arraySize; i++) {
			numberOfSubArrays += getSubNum(i, arraySize);
		}

//		for (int i = 1; i <= arraySize; i++) {
//			numberOfSubArrays += getNumberSum(arraySize, i);
//		}

		///////////////////////////// <-------------- ������� ���� (1)
		return numberOfSubArrays;
	}

	private int getSubNum(int i, int arraySize) {
		// TODO Auto-generated method stub
		int tmp = 0;
		for (int j = 0; j < arraySize - i; j++) {
			for (int k = 0; k < arraySize - i; k++) {
				tmp++;
			}
		}
		// System.out.println(">" + tmp);
		return tmp;
	}
	/*
	 * getSubNum() -> print ������ OK >16 >9 >4 >1
	 */

	private int getNumberSum(int arraySize, int initialNumber) {
		int maxX = 0;
		for (int i = initialNumber; i <= arraySize; i++) {
			if (i <= arraySize) {
				maxX++;
			} else {
				break;
			}
		}
		return (maxX * maxX);
	}
	/*
	 * getNumberSum() - > ���� ��ġ�� �ڷ� �ϳ��� �̵� - > ��ø loop ������� �ʰ� , �������� ��������
	 */

	/**
	 * �ִ밪�� ã�� ���
	 *
	 * @param inputData int[][] �Էµ�����(NxN�迭)
	 * @return int �ִ밪
	 */
	public int getMaximumValue(int[][] inputData) {
		int maximumValue = Integer.MIN_VALUE;
		//boolean bFirst = false; // ?
		// int arraySize = inputData.length;

		//////////////////////// ������� ���� (2) ---------------->
//		for (int i = 1; i <= inputData.length; i++) {
//		//for (int i = 1; i <= 1; i++) {	
//			int tMaximumValue = getMaxValue(inputData, i);
//
//			if (bFirst) { // ?? true �� ���ִ� ���� ����(�̺κ��� �̻�)
//				bFirst = false;
//				maximumValue = tMaximumValue;
//			} else {
//				if (maximumValue < tMaximumValue) {
//					maximumValue = tMaximumValue;
//				}
//			}
//		}
		// test ��
		//int tMaximumValue = getMaxValue(inputData, 2);
		//System.out.println("==>" + tMaximumValue);
		///////////////////////////// <-------------- ������� ���� (2)
		
		// ���⼭ �ٽ�
		for (int i = 1; i <= inputData.length; i++) {	
			int tMaximumValue = getMaxValue_2(inputData, i);

			if (maximumValue < tMaximumValue) {
				maximumValue = tMaximumValue;

			}
		}
		
		
		
		return maximumValue;
	}

	
	private int getMaxValue_2(int[][] inputData, int endValue) {
	
		int maximumValue = 0; // rtn ��
		int inputSize = inputData.length; // �迭 size
		int cur_x_st = 0;
		int cur_x_end = endValue;
		int cur_y_st = 0;
		int cur_y_end = endValue;
		int tmp_max = 0; // ? Integer.MIN_VALUE;
		
		while (cur_x_end <= inputSize) { // N x N �迭�� ����� ���� �ʾƾ� ...
			tmp_max = 0;
			for (int i=cur_x_st; i< cur_x_end ; i++) {
				for (int j=cur_y_st; j< cur_y_end ; j++) {
					tmp_max += inputData[i][j];
				}
			}
			cur_y_st++;
			cur_y_end++; // �ϴ� ���� �����ϵ���
			
			if (cur_y_end > inputSize) { // ���� �����ϴٰ� �迭�� ������ ���� Ŀ����
				
				cur_x_st++;
				cur_x_end++;
				cur_y_st = 0;
				cur_y_end = endValue;
			}
			
			if (maximumValue < tmp_max) {
				maximumValue = tmp_max;
			}
			
		}
		
		return maximumValue;
	}
	
	// ���� Best Answer
	private int getMaxValue(int[][] inputData, int endValue) {
		// TODO Auto-generated method stub
		int maximumValue = 0;
		int maxLength = inputData.length; //�迭�� ũ��
		int orgCurrentXEnd = endValue;    //1,2,3,4 �� - ������

		int currentXEnd = endValue; // orgCurrentXEnd �� ���̴�??
		int currentYEnd = endValue;
		int currentXStart = 0;
		int currentYStart = 0;

		while (maxLength >= currentXEnd) {
			int sum = 0;
			for (int i = currentXStart; i < currentXEnd; i++) {
				for (int j = currentYStart; j < currentYEnd; j++) {
					sum = sum + inputData[j][i];
					System.out.println(">" + j + "/" + i + " = " + inputData[j][i]);
				}
			}
			currentXStart++;
			currentXEnd++;
			
			System.out.println("=>" + sum);
			
			// currentYStart++;
			// currentYEnd++;

			if (maximumValue < sum) {
				maximumValue = sum;
			}
		}
		currentYStart++;
		currentYEnd++;

		currentXEnd = orgCurrentXEnd;
		currentXStart = 0;
		while (maxLength >= currentYEnd) {
			int sum = 0;
			for (int i = currentXStart; i < currentXEnd; i++) {
				for (int j = currentYStart; j < currentYEnd; j++) {
					sum = sum + inputData[j][i];
					System.out.println(">>" + j + "/" + i + " = " + inputData[j][i]);
				}
			}
			currentXStart++;
			currentXEnd++;

			currentYStart++;
			currentYEnd++;
			
			System.out.println("==>" + sum);
			
			if (maximumValue < sum) {
				maximumValue = sum;
			}
		}
		return maximumValue;
	}
}
