package kr.co.jungsuk.ex.e05;

public class P05_1 {
	// [5-5] ������ 1�� 9������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ 
	// ���α׷��̴�. (1)~(2)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		
		//�ۼ�
		// �迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
		for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			/*
			(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			*/ 
			tmp = ballArr[j];
			ballArr[j] = ballArr[i];
			ballArr[i] = tmp;
		}
		// �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
		/* (2) */
		for (int j =0 ; j< ball3.length ; j++) {
			ball3[j] = ballArr[j];
		}
		
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
	}

}
