package kr.co.infopub.chapter.s104;
public class Card {
	private String cardVal; // H8, H6, ...
	public String getCardVal() {
		return cardVal;
	}
    // �⺻(��Ʈ) ������
	public Card() {
		//0~3
		int suit=(int)(Math.random()*CardUtil.SUIT.length);
		//0~12
		int valu=(int)(Math.random()*CardUtil.VALU.length);
		//������ ī�� ���� ���´�. H8, H6, ...
		cardVal=CardUtil.SUIT[suit]+CardUtil.VALU[valu];
	}
	// �׽�Ʈ��
	public Card(String s) {
		this.cardVal=s;  // ���ڿ��� �� ����
	}
	// ���� ������
	public Card(Card c) {      // �ٸ� ī���� ī�尪�� �����´�.
		this(c.getCardVal());  // ���ڿ��� �� ����
		// this.cardVal=c.getCardVal(); //����
	}
	// cardVal ���� 
	@Override
	public String toString() {
		return "[" + cardVal + "]";
	}
}//
