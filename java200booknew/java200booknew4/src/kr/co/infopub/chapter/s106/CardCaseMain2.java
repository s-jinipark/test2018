package kr.co.infopub.chapter.s106;
public class CardCaseMain2 {
	public static void main(String[] args) {
		CardCase2 cc=new CardCase2();
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
