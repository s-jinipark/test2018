package kr.co.infopub.chap013;
public class Coffee2Main100 {
//�ݺ�, �������� �޼���� �����.
	public static void main(String[] args) {
		
		int myMoneyA = 800;  //800���� Ŀ�� �����ϱ�?
		int cupsA = Coffee2Main100.coffee(myMoneyA);
		System.out.println("1 - " + cupsA);
		Coffee2Main100.printCoffee(cupsA);
		System.out.println("2 - " + cupsA);	// ȣ�� ��,�� ����
		
		int myMoneyB = 150;  //150���� Ŀ�� �����ϱ�?
		int cupsB = coffee(myMoneyB);
		printCoffee(cupsB);
		
	}//main
	
	public static int coffee(int money){
		int cups=0;   //���ܳ��ñ� �غ�
		if(money > 0){
			cups=money/200;
		}else if(money==0){
			cups=0;
		}else{
			cups=-1;
		}
		return cups;
	}//coffee
	
	public static void printCoffee(int cups){
		if(cups>0){
			System.out.println("Ŀ�� "+cups+"�� �Դϴ�.");
			//System.out.printf("Ŀ�� %d�� �Դϴ�.",cups);
		}else{
			System.out.println("�׼��� ���ڶ��ϴ�.");
		}
		cups++; // (2) ��� �� ���� ��Ű��...
				// ȣ���� ������ �ٽ� ��� ��
	}//printCoffee
}

/*
��� �⺻Ÿ���� ���� ���� �����̰�,
��� ����Ÿ���� ������ ���� �����̴�.
�׷���.. �޼����� �ƱԸ�Ʈ�� ��� Ÿ���� �ѱ� ���� ���� ���� ������ �ȴٴ� ���� ����**
*/