package kr.co.infopub.chap073;

public class DepositMain {
	public static void main(String[] args) {
		//3�� 80���� ���� �� 3%
		int month=36;
		double a0=800000;
		double rate=3;
		double amount=Exponential.deposit(month, a0, rate);
		System.out.printf("%d���� %f�� ���� : %f\n",month,
				a0,Math.ceil(amount));

	}

}
