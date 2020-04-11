package kr.co.infopub.chapter.s103;
// ��ü - �߿��� �����͸� ����
public class Card {
	// ������ ��ȣ- ����ȭ - ���� ������ private
	private String cardVal; // H8, H6, ...
	// ��� ���� �޼���
	public String getCardVal() {
		return cardVal;
	}
	// �⺻ ������ - ��� �ʱ�ȭ
	public Card() {
		this("H2");  //�Ʒ��� ����
		//this.cardVal="H2";
	}
	// �׽�Ʈ��
	public Card(String s) {
		this.cardVal=s;  // ���ڿ��� �� ����
	}
	// ���� ������
	public Card(Card c) {
		this(c.getCardVal());  // ���ڿ��� �� ����
		// this.cardVal=c.getCardVal(); //����
	}
	// cardVal ����  [H3]
	@Override
	public String toString() {
		return "[" + cardVal + "]";
	}
}//
