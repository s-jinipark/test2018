package kr.co.jungsuk.ex.e05;

public class P07_1 {
	// [5-7] ���� 5-6�� ������ ������ �߰��� ���α׷��̴�. Ŀ�ǵ�������κ��� �Ž��� ��
	// �ݾ��� �Է¹޾� ����Ѵ�. ������ ������ ������ �Ž������� ������ �� ������, ���Ž���
	// ���� �����մϴ�.����� ����ϰ� �����Ѵ�. ������ ���� ����� ������, �Ž������� ����
	// �� ��ŭ ���� ������ ���� ���� ������ ������ ȭ�鿡 ����Ѵ�. (1)�� �˸��� �ڵ带 ��
	// � ���α׷��� �ϼ��Ͻÿ�.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		if(args.length!=1) {
			System.out.println("USAGE: java P07_1 3120");
			System.exit(0);
		}
		*/
		// ���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�.
		
		
		//[2] �����Ͽ� ����
		//int money = Integer.parseInt(args[0]);
		//int money = 2340;
		int money = 3510;
		
		System.out.println("money="+money);
		int[] coinUnit = {500, 100, 50, 10 }; // ������ ����
		int[] coin = {5, 5, 5, 5}; // ������ ������ ����
		
		for(int i=0;i<coinUnit.length;i++) {
			int coinNum = 0;
			/* (1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
			1. �ݾ�(money)�� ���������� ������ �ʿ��� ������ ����(coinNum)�� ���Ѵ�.
			2. �迭 coin���� coinNum��ŭ�� ������ ����.
			(���� ����� ������ ���ٸ� �迭 coin�� �ִ� ��ŭ�� ����.)
			3. �ݾ׿��� ������ ����(coinNum)�� ���������� ���� ���� ����.
			*/
			
			int mok = 0;
			//int nam = 0;
			
			mok = money / coinUnit[i];
			//nam = money % coinUnit[i];
			coinNum = mok;
			System.out.println(coinUnit[i]+"��: "+coinNum);
			//money = nam;
			
			if (coin[i] < coinNum) {
				money = money - coin[i]*coinUnit[i]; 
				coin[i] = 0;
			} else {
				money = money - mok*coinUnit[i]; 
				coin[i] -= mok;
			}

		}
		
		if(money > 0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0); // ���α׷��� �����Ѵ�.
		}
		
		System.out.println("=���� ������ ���� =");
		
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"��:"+coin[i]);
		}
	}

}
