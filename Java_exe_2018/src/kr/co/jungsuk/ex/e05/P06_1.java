package kr.co.jungsuk.ex.e05;

public class P06_1 {
	// [5-6] ������ �Ž������� �� ���� �������� ������ �� �ִ����� ����ϴ� �����̴�. 
	// ���� money�� �ݾ��� �������� �ٲپ��� �� ���� �� ���� ������ �ʿ����� ����ؼ� ����϶�. 
	// ��, ������ �� ���� ���� �������� �Ž��� �־���Ѵ�. (1)�� �˸��� �ڵ带 �־
	// ���α׷��� �ϼ��Ͻÿ�.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++) {
			/*
			(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
			*/ 
			int mok = 0;
			int nam = 0;
			
			mok = money / coinUnit[i];
			nam = money % coinUnit[i];
			System.out.println(coinUnit[i] + "�� : " + mok);
			money = nam;
		}
	}

}
