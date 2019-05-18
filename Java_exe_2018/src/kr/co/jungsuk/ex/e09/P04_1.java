package kr.co.jungsuk.ex.e09;

public class P04_1 {
	// [9-4] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
	/*
		�޼���� : printGraph
		�� �� : �־��� �迭�� ��� ����ŭ �־��� ���ڸ� ���η� ����� ��, ���� ����Ѵ�.
		��ȯŸ�� : ����
		�Ű����� : int[] dataArr - ����� �׷����� ������
				char ch - �׷����� ����� ����.
	*/
	static void printGraph(int[] dataArr, char ch) {
		/*
		(1) printGraph�޼��带 �ۼ��Ͻÿ�.
		*/
		
		for (int idx : dataArr) {
			String tmp_s = "";
			for (int i = 0; i<idx; i++) {
				tmp_s += ch;
			}
			tmp_s += idx;
			System.out.println(tmp_s);
		}
	}
	
	public static void main(String[] args) {
		printGraph(new int[]{3,7,1,4},'*');
	}

}