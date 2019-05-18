package kr.co.jungsuk.ex.e09;

public class P12_1 {
	// [9-12] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
	/*
		�޼���� : getRand
		�� �� : �־��� ����(from~to)�� ���� ������ �������� ��ȯ�Ѵ�.
			(���� ��谪 ��� ������ ����)
			from�� ���� to�� ������ Ŭ ��쵵 ó���Ǿ�� �Ѵ�.
		��ȯŸ�� : int
		�Ű����� : int from - ������ ���۰�
			int to - ������ ����
	 */
	public static int getRand(int from, int to) {
		
		//int rtn_val = 0;

		//return rtn_val;
		
		// �ϴ� ����
		return (int)(Math.random() * (Math.abs(to-from)+1))+ Math.min(from,to);
		
	}
		
	public static void main(String[] args) {

		for(int i=0; i< 20; i++)
			System.out.print(getRand(1,-3)+",");
	}
}