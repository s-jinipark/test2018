package kr.co.jungsuk.ex.e05;

public class P08_1 {
	// [5-8] ������ �迭 answer�� ��� �����͸� �а� �� ������ ������ ��� ������ŭ ��*��
	// �� �� �׷����� �׸��� ���α׷��̴�. (1)~(2)�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		for(int i=0; i < answer.length;i++) {
			/* (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�. */ 
			//[2] 1~4 ���ڸ� �о� �� ������ ������ '*'�� ���
			counter[answer[i]-1]++;
			
		}
		
		for(int i=0; i < counter.length;i++) {
			/*
			(2) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			*/
			System.out.print(counter[i]);
			for (int j=0; j<counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
