package kr.co.jungsuk.ex.e09;

public class P11_1 {
	// [9-11] Ŀ�ǵ�������� 2~9������ �� ���� ���ڸ� �޾Ƽ� �� ���ڻ����� �������� ���
	//	�ϴ� ���α׷��� �ۼ��Ͻÿ�.
	//	���� ��� 3�� 5�� �Է��ϸ� 3�ܺ��� 5�ܱ��� ����Ѵ�.

	public static void gugudan(int begin, int end) {
		
		for (int i = begin ; i<= end ; i++) {
			
			for (int j=1 ; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println("" );
		}

	}
		
	public static void main(String[] args) {

		gugudan(3,5);
	}
}