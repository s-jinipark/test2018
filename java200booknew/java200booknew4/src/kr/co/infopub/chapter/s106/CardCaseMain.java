package kr.co.infopub.chapter.s106;
public class CardCaseMain {
	public static void main(String[] args) {
		CardCase cc=new CardCase();
		cc.make();     // ���� �ٸ� ī�� 20�� �����
		cc.print();
		System.out.println("--------------------------");
		cc.shuffle();   // ī�� ����
		cc.print();
		System.out.println("--------------------------");
		cc.shuffle();   // ī�� ����
		cc.print();
	}
}
