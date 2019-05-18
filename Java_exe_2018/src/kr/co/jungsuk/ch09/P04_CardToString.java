package kr.co.jungsuk.ch09;
class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}

class P04_CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		/*
		Card �ν��Ͻ��� toString() �� ȣ���ϸ�, Object Ŭ������ toString() �� ȣ��
		-> �������̵� ���� �ʾұ� ����
		
		*/
	}
}
