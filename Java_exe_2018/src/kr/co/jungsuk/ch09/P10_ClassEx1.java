package kr.co.jungsuk.ch09;
final class Card10 {
	String kind;
	int num;

	Card10() {
		this("SPADE", 1);
	}

	Card10(String kind, int num) {
		this.kind = kind;
		this.num  = num;
	}

	public String toString() {
		return kind + ":" + num;
	}
}

class P10_ClassEx1 {
	public static void main(String[] args) throws Exception {
		Card10 c  = new Card10("HEART", 3);       // new�����ڷ� ��ü ����
		Card10 c2 = Card10.class.newInstance();   // Class��ü�� ���ؼ� ��ü ����

		//Class cObj = c.getClass(); //[2] ������ ��ü�� ���� ��� ���
		
		//Class cObj = Card10.class;  //[2] Ŭ���� ���ͷ�(*.class)�� ���� ��� ���
		
		//Class cObj = Class.forName("Card10");  //[2] 
		// -> ���� �� : java.lang.ClassNotFoundException: Card10
		Class cObj = Class.forName("kr.co.jungsuk.ch09.Card10");  //[2] 
		// -> Ŭ���� �̸����� ���� ��� ���
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());		
	}
}
