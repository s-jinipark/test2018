package imsi.suji.test2018.A1.q1;

public class Stick {
	/**
	 * N���� �ﰢ���� ����� ���� ���� ������ ���ϴ� ���
	 *
	 * @param inputData int �Էµ�����(�ﰢ�� ����)
	 * @return int ���� ����
	 */
	public int getNumberOfStickForTriangle(int inputData) {
		int numberOfStickForTriangle = 0;
		//////////////////////// ������� ���� (1) ---------------->
		numberOfStickForTriangle = 3 + (inputData-1) *2;
		///////////////////////////// <-------------- ������� ���� (1)
		return numberOfStickForTriangle;
	}

	/**
	 * N���� �Ƕ�̵带 ����� ���� ���� ������ ���ϴ� ���
	 *
	 * @param numberOfLayers int �Էµ�����(�Ƕ�̵� ����)
	 * @return int ���� ����
	 */
	public int getNumberOfStickForPyramid(int numberOfLayers) {
		int numberOfStickForPyramid = 0;
		//////////////////////// ������� ���� (2) ---------------->
		int sum1 = 0;
		int sum2 = 0;
		//[1] ���
		for (int i=numberOfLayers ; i>=1 ; i--) {
			sum1 += 3+(2*i-2)*2;
			sum2 += i;
		}
		sum2 = sum2 - numberOfLayers; // N-1 ���� ����ؾ� �ϹǷ�

		//[2] ���
		numberOfStickForPyramid = sum1 - sum2;
		
		///////////////////////////// <-------------- ������� ���� (2)
		return numberOfStickForPyramid;
	}
}
